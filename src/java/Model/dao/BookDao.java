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

    public BookDao() {
        conn = db.getConn();
    }

    public List<Book> getListAllBook() {
        List<Book> lst = new ArrayList<>();

        String query = "SELECT idBook, title, price, author, publisher, introduction, imageLink FROM book";

        try {
            ResultSet rs = db.getResultSet(query);
            int id;
            String title, author, publisher, introduction, imageLink;
            Float price;
            while (rs.next()) {
                id = rs.getInt(BookConstant.COLUMN_BOOK_ID);
                title = rs.getString(BookConstant.COLUMN_BOOK_TITLE);
                price = rs.getFloat(BookConstant.COLUMN_BOOK_PRICE);
                author = rs.getString(BookConstant.COLUMN_BOOK_AUTHOR);
                publisher = rs.getString(BookConstant.COLUMN_BOOK_PUBLISHER);
                introduction = rs.getString(BookConstant.COLUMN_BOOK_INTRODUCTION);
                imageLink = rs.getString(BookConstant.COLUMN_BOOK_LINK);
                lst.add(new Book(id, title, price, author, publisher, introduction, imageLink));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lst;
    }

    public Book getBookDetail(String id) {
        String query = "SELECT idBook, title, price, author, publisher, introduction, imageLink FROM book where idBook = ?";
        PreparedStatement ps = null;
        Book book = new Book();
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                book.setIdBook(rs.getInt("idBook"));
                book.setAuthor(rs.getString(BookConstant.COLUMN_BOOK_AUTHOR));
                book.setImageLink(rs.getString(BookConstant.COLUMN_BOOK_LINK));
                book.setIntroduction(rs.getString(BookConstant.COLUMN_BOOK_INTRODUCTION));
                book.setPrice(rs.getFloat(BookConstant.COLUMN_BOOK_PRICE));
                book.setPublisher(rs.getString(BookConstant.COLUMN_BOOK_PUBLISHER));
                book.setTitle(rs.getString(BookConstant.COLUMN_BOOK_TITLE));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return book;
    }

    public BookCart getBookInfor(int id) {
        String query = "SELECT idBook, title, price, imageLink FROM book where idBook = ?";
        PreparedStatement ps = null;
        BookCart bc = new BookCart();
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                bc.setId(id);
                bc.setImageLink(rs.getString(BookConstant.COLUMN_BOOK_LINK));
                bc.setPrice(rs.getFloat(BookConstant.COLUMN_BOOK_PRICE));
                bc.setTitle(rs.getString(BookConstant.COLUMN_BOOK_TITLE));
                bc.setQuantity(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bc;
    }
}
