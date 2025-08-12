/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.libraryfunction;

/**
 *
 * @author Administrator
 */
//STRUCTURE NG DATA (eto yung mode)
public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private boolean isBorrowed;
    private String borrowedBy;
    
    public Book (int id, String title, String author, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;  
        this.genre = genre; 
        this.isBorrowed = false;
        this.borrowedBy = null;
        
    }
    
    //Spagetters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isBorrowed() { return isBorrowed; }
    public String getBorrowedBy() { return borrowedBy; }

    //Pansiitter
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }
    public void setBorrowedBy(String borrowedBy) { this.borrowedBy = borrowedBy; }
}
