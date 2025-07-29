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
    private boolean isBorrowed;
    private String borrowedBy;
    
    public Book (int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;   
        this.isBorrowed = false;
        this.borrowedBy = null;
        
    }
    
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return isBorrowed; }
    public String getBorrowedBy() { return borrowedBy; }

    
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }
    public void setBorrowedBy(String borrowedBy) { this.borrowedBy = borrowedBy; }
}
