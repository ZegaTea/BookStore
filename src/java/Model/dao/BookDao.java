/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import java.sql.*;
import java.util.List;
import Model.entities.*;
import java.util.ArrayList;
import Common.BookConstant;

/**
 *
 * @author dovan
 */
public class BookDao {
    private Connection conn = null;
    private BookManagementDbContext db = new BookManagementDbContext();
    public BookDao(){
        conn = db.getConn();
    }
    
    public List<Book> getListAllBook(){
        List<Book> lst = new ArrayList<>();
        
        String query = "SELECT idBook, title, price, author, publisher, introduction, imageLink FROM book";
        
        try{
            ResultSet rs = db.getResultSet(query);
            int id;
            String title, author, publisher, introduction, imageLink;
            Float price;
            while(rs.next()){
                id = rs.getInt(BookConstant.COLUMN_BOOK_ID);
                title = rs.getString(BookConstant.COLUMN_BOOK_TITLE);
                price = rs.getFloat(BookConstant.COLUMN_BOOK_PRICE);
                author = rs.getString(BookConstant.COLUMN_BOOK_AUTHOR);
                publisher = rs.getString(BookConstant.COLUMN_BOOK_PUBLISHER);
                introduction = rs.getString(BookConstant.COLUMN_BOOK_INTRODUCTION);
                imageLink = rs.getString(BookConstant.COLUMN_BOOK_LINK);
                lst.add(new Book(id, title, price, author, publisher, introduction, imageLink));
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return lst;
    }
}
