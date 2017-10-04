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
public class Book {
    private int idBook;
    private String title;
    private Float price;
    private String author;
    private String publisher;
    private String introduction;
    private String imageLink;

    public Book(int idBook, String title, Float price, String author, String publisher, String introduction, String imageLink) {
        this.idBook = idBook;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.introduction = introduction;
        this.imageLink = imageLink;
    }
    
    public Book(){
        
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
    
}
