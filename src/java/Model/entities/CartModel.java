/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entities;

/**
 *
 * @author dovan
 */
public class CartModel {
    private int idBook;
    private int quantity;

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CartModel(int idBook, int quantity) {
        this.idBook = idBook;
        this.quantity = quantity;
    }
    
   public CartModel(){
       
   }
}
