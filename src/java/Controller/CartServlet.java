/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Common.Constant;
import Model.dao.BookDao;
import java.util.List;
import Model.entities.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author dovan
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String bookId = request.getParameter("id");
        int id = Integer.valueOf(bookId);
        String quantity = request.getParameter("quantity");
        String title = request.getParameter("title");
        String link = request.getParameter("link");
        String price = request.getParameter("price");
        BookCart bc;
        BookDao bookDao = new BookDao();
        if (quantity == null) {
            bc = bookDao.getBookInfor(id);
        } else {
            bc = new BookCart(id, link, title, Float.valueOf(price), Integer.valueOf(quantity));
        }

        List<BookCart> cart;
        if (session.getAttribute(Constant.CART_SESSION) == null) {
            cart = new ArrayList<>();
            cart.add(bc);
        } else {
            cart = (ArrayList<BookCart>) session.getAttribute(Constant.CART_SESSION);
            int state = 0;
            for(int i = 0; i< cart.size(); i++){
                if(cart.get(i).getId() == id){
                    int totalQuantities = cart.get(i).getQuantity() + Integer.valueOf(quantity);
                    bc.setQuantity(totalQuantities);
                    cart.set(i, bc);
                    state = 1;
                    break;
                }
            }
            if(state == 0) cart.add(bc);
        }

        session.setAttribute(Constant.CART_SESSION, cart);
//        RequestDispatcher rd = request.getRequestDispatcher("shop.jsp");
//        response.setAttribute("
//        rd.forward(request, response);
        session.setAttribute(Constant.CHECK_SESSION, "true");
        String url = request.getRequestURL().toString();
//        if(url.contains("DetailServlet")){
            response.sendRedirect("/BookShop/index.jsp");
//        } else {
//            response.sendRedirect(url);
//        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
