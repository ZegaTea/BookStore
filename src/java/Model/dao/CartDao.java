/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dovan
 */
public class CartDao {

    private Connection conn = null;
    private BookManagementDbContext db = new BookManagementDbContext();

    public CartDao() {
        conn = db.getConn();
    }
    
    public int pushToCart(float price){
        String query="insert into cart(totalPrice) value(?)";
        PreparedStatement ps =null;
        int id = -1;
        try{
            ps = conn.prepareStatement(query);
            ps.setFloat(1, price);
            ps.executeUpdate();
            String q = "SELECT LAST_INSERT_ID() AS id;";
            ps.clearBatch();
            ps = conn.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return id;
    }
    
    public void pushCartItem(int bookId, int cartId, int count, float total){
        String query = "INSERT INTO `cartdetail`(`idBook`, `idCart`, `count`, `totalCount`) VALUES(?,?,?,?)";
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(query);
            ps.setInt(1, bookId);
            ps.setInt(2, cartId);
            ps.setInt(3, count);
            ps.setFloat(4, total);
            
            ps.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
