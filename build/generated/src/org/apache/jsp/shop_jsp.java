package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.dao.BookDao;
import Model.entities.*;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');

    if (session.getAttribute(Common.Constant.CHECK_SESSION) != null) {
        String check = session.getAttribute(Common.Constant.CHECK_SESSION).toString();
        if (check.equals("true")) {

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    alert(\"Thêm gi? hàng thành công\")\r\n");
      out.write("</script>\r\n");

    session.setAttribute(Common.Constant.CHECK_SESSION, "false");
        }
    }


      out.write("\r\n");
      out.write("<div class=\"product-big-title-area\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"product-bit-title text-center\">\r\n");
      out.write("                    <h2>Shop</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"single-product-area\">\r\n");
      out.write("    <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            ");
                BookDao bookDao = new BookDao();
                List<Book> list = bookDao.getListAllBook();
                for (Book item : list) {
                    String href = "CartServlet?id=" + item.getIdBook();
                    out.println("<div class='col-md-3 col-sm-6'><div class='single-shop-product'><div class='product-upper'>");
                    out.println("<img src='" + item.getImageLink() + "'/></div>");
                    out.println("<h2><a href='#'>" + item.getTitle() + "</a></h2>");
                    out.println("<div class='product-carousel-price'><ins>$" + item.getPrice() + "</ins></div>");
                    out.println("<div class='product-option-shop'> "
                            + "<a class='add_to_cart_button' href='" + href + "'>Add to cart</a>"
                            + "</div></div></div>");
                }
            
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"product-pagination text-center\">\r\n");
      out.write("                    <nav>\r\n");
      out.write("                        <ul class=\"pagination\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                                    <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"#\">1</a></li>\r\n");
      out.write("                            <li><a href=\"#\">2</a></li>\r\n");
      out.write("                            <li><a href=\"#\">3</a></li>\r\n");
      out.write("                            <li><a href=\"#\">4</a></li>\r\n");
      out.write("                            <li><a href=\"#\">5</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                                    <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>                        \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(' ');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
