/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */

//LIST OF DATA AND METHODS THAT CONTROL THE DATA (eto yung controller)
public class BookShelf {
    
    private List<Book> books = new ArrayList<>();
    
    public BookShelf() {
        //Fiction
        
        books.add(new Book(3, "One Piece, Vol.41", "Eiichiro Oda", "Manga"));
        books.add(new Book(4, "Capeta", "Masahito Soda", "Manga"));
        
        books.add(new Book(5, "Absolute Batman", "Scott Snyder", "Comic"));
        books.add(new Book(6, "Ultimate Spider-Man", "Brian Michael Bendis", "Comic"));
        
        //Non-Fiction
        books.add(new Book(7, "An Anarchy of Families: State and Family in the Philippines", "Alfred W. McCoy", "History"));
        books.add(new Book(8, "Looking Back", "Ambeth Ocampo", "History"));
        
        books.add(new Book(9, "The Selfish Gene", "Richard Dawkins", "Science"));
        books.add(new Book(10, "The Blind Watchmaker", "Richard Dawkins", "Science"));
        
        books.add(new Book(11, "Che: A Revolutionary Life", "Jon Lee Anderson", "Biography"));
        books.add(new Book(12, "The First Filipino", "León Ma. Guerrero", "Biography"));
        
        //Academic / Reference
        books.add(new Book(13, "The Web Application Hacker's Handbook", "Dafydd Stuttard", "Cybersecurity"));
        books.add(new Book(14, "Offensive Countermeasures", "John Strand", "Cybersecurity"));
        
        books.add(new Book(15, "Introduction to Algorithms", "Thomas H. Cormen", "Computer Science"));
        books.add(new Book(16, "Code: The Hidden Language of Computer Hardware and Software", "Charles Petzold", "Computer Science"));
         
        books.add(new Book(17, "The Chicago Manual of Style", "University of Chicago Press", "Language"));
        books.add(new Book(18, "Eats, Shoots & Leaves: The Zero Tolerance Approach to Punctuation", "Lynne Truss", "Language"));
    }
    
    public void GetBooks() {
        
        
        for (Book book : books) {
            System.out.print("ID: " + book.getId() +
                           ", Title: " + book.getTitle() +
                           ", Author: " + book.getAuthor() +
                           ", Genre: " + book.getGenre());
                           
                           if (book.isBorrowed()) {
                               System.out.println(", Borrowed: Yes, by " + book.getBorrowedBy());
                           } else {
                               System.out.println(", Borrowed: No");
                           }
        }
        
        System.out.print("Genre filter (press enter to skip): ");
        
        Scanner readInput = new Scanner(System.in);
       
        String genreFilter = readInput.nextLine().trim();
        
        if (!genreFilter.isEmpty()) {
            System.out.println("Book in genre of " + genreFilter);
            System.out.println("=======================");
            
            boolean found = false;
            
            for (Book book : books) {
                if(book.getGenre().equalsIgnoreCase(genreFilter)) {
                    System.out.print("ID: " + book.getId() +
                            ", Title: " + book.getTitle() +
                            ", Author: " + book.getAuthor() +
                            ", Genre: " + book.getGenre());
                           
                            if (book.isBorrowed()) {
                                System.out.println(", Borrowed: Yes, by " + book.getBorrowedBy());
                            } else {
                                System.out.println(", Borrowed: No");
                            }
                
                            found = true;
                }
            }
            
            if (!found) {
                System.out.println("No books of this genre found :<");
            }
        } 
    }
    
    
    
    public boolean GetBorrowedBooks(String userName) {
        
        boolean found = false;
        
        for (Book book : books) {
            
            if (book.isBorrowed() && book.getBorrowedBy().equalsIgnoreCase(userName)) {
                System.out.println("ID: " + book.getId() +
                           ", Title: " + book.getTitle() +
                           ", Author: " + book.getAuthor() +
                           ", Genre: " + book.getGenre() +
                           ", Borrowed: Yes, by " + book.getBorrowedBy());                             
                found = true;           
            } 
        }   
        
        if (!found) {
            System.out.println("No username found :<");
        }
        
        return found;
        
    }
    
    public void ReturnBook(int id, String borrowerName) {
        
        for (Book book : books) {
            if (book.getId() == id) {
                book.setBorrowed(false);
                book.setBorrowedBy(null);
                System.out.println("Successfully returned book.");
                return;
            }
            
        }
        
        System.out.println("Book with " + id + " is not found");
        
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
        
        System.out.println("Book with " + id + " is not found");
    }
}

