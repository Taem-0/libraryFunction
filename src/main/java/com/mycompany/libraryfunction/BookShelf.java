/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryfunction;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrator
 */

//LIST OF DATA AND METHODS THAT CONTROL THE DATA (eto yung controller)
public class BookShelf {
    
    private List<Book> books = new ArrayList<>();
    
    public BookShelf() {
        books.add(new Book(1, "Tite", "Dr. Lazer Eyes"));
        books.add(new Book(2, "Burat", "Barok"));
    }
    
    public void GetBooks() {
        
        for (Book book : books) {
            System.out.print("ID: " + book.getId() +
                           ", Title: " + book.getTitle() +
                           ", Author: " + book.getAuthor());
                           
                           if (book.isBorrowed()) {
                               System.out.println(", Borrowed: Yes, by " + book.getBorrowedBy());
                           } else {
                               System.out.println(", Borrowed: No");
                           }
        }
    }
    
    public void BorrowBook(int id, String borrowerName) {
        
        for (Book book : books) {
            if (book.getId() == id) {
                if (book.isBorrowed()) {
                    System.out.println("Book is already borrowed by" + book.getBorrowedBy());
                } else {
                    book.setBorrowed(true);
                    book.setBorrowedBy(borrowerName);
                    System.out.println("Succesfully borrowed book.");
                }
                return;
            }
        }
        
        System.out.println("Book with" + id + "is not found");
    }
}

