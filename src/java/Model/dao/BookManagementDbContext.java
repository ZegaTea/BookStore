/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;


import Model.entities.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Common.BookConstant;

/**
 *
 * @author dovan
 */
public class BookManagementDbContext {
    private Connection conn = null;
    private List<Book> list = null;
    public Connection getConn(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
            this.conn = DriverManager.getConnection(Common.Constant.BOOKDB, Common.Constant.USER, Common.Constant.PASS);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
    public ResultSet getResultSet(String query){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getResult(PreparedStatement ps){
        ResultSet rs = null;
        try{
            rs = ps.executeQuery();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return rs;
    }
    
//    public List getListBook(String query, String... param){
//       list = new ArrayList<>();
//        try {
//        PreparedStatement ps = this.conn.prepareStatement(query);
//            for (int i = 0; i < param.length; i++) {
//                ps.setString(i+1, param[i]);
//            }
//        ResultSet rs = ps.executeQuery();
//       
//        Book book ;
//            while(rs.next()){
//                book = new Book();
//                book.setIdBook(rs.getInt(BookConstant.COLUMN_BOOK_ID));
//                book.setAuthor(rs.getString(BookConstant.COLUMN_BOOK_AUTHOR));
//                book.setPrice(rs.getFloat(BookConstant.COLUMN_BOOK_PRICE));
//                bo
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(BookManagementDbContext.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
}
