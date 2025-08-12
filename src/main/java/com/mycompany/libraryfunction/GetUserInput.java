/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryfunction;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
//VIEW (user interface, dito yung mga methods na kumukuha ng input tapos ineexecute ng controller. Dito yung validation ng mga input ng user. ayus ayusing nyo vaidation hahahhahw kung ano ano pa naman pinag tatype ni sir )
class GetUserInput {
    
    BookShelf shelf = new BookShelf();
    
    void MainMenu() {
        
        Scanner readInput = new Scanner(System.in);
        boolean closeApp = false;
        
        while (closeApp == false) {
            System.out.println("==== LIBRARY MENU ====");
            
            System.out.println("1. View all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.println("=======================");
            System.out.print("Enter your choice: "); 
            
            String userCommand = readInput.nextLine();
            
            while(userCommand == null || userCommand.isEmpty()) {
                System.out.println("Invalid, please enter a number from 1-4");
                userCommand = readInput.nextLine();
            }      
            
            switch (userCommand) {
                case "1":
                    
                    shelf.GetBooks();
                    break;
                case "2":
                    
                    ProcessBorrow();
                    break;
                 
                case "3":
                    
                    ProcessReturn();
                    break;
                case "4":

                    closeApp = true;
                    break;
                
                default:
                    
                    System.out.println("Invalid, please enter a number from 1-4");
                    break;
            }
            
            
        }
        
    }
    
    
    private void ProcessBorrow() {
        
        Scanner readInput = new Scanner(System.in);
       
        String userName = GetName();
                
        shelf.GetBooks();
        System.out.println("=======================");
                          
        int processedId = GetID();
                
        shelf.BorrowBook(processedId, userName);
    }
    
    private void ProcessReturn() {
        
        Scanner readInput = new Scanner(System.in);
        
        String userName = GetName();
        
        boolean hasBorrowedBooks = shelf.GetBorrowedBooks(userName);
        System.out.println("=======================");
        
        if(hasBorrowedBooks) {
            int processedId = GetID();
            shelf.ReturnBook(processedId, userName);
        } else {
            System.out.println("No books to return.");
        }
        
        
        
        
    }
    
    private String GetName() {
        
        Scanner readInput = new Scanner(System.in);
                
        System.out.print("Enter your name: ");
        String userName = readInput.nextLine().trim();
                
        while (userName.isBlank()) {
            System.out.println("Invalid input. Please enter your name.");
            userName = readInput.nextLine();
        }
        
        return userName;
    }
    
    
    private int GetID() {
        
        Scanner readInput = new Scanner(System.in);
        int parsedIdInput;
        
        while(true) {
            System.out.print("Enter the id of your choice: ");
            String idInput = readInput.nextLine().trim();

            if (idInput.isBlank()) {
                System.out.println("Invalid input. Please enter an ID number.");
                continue;
            }
                    
            try {
                parsedIdInput = Integer.parseInt(idInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
        
        return parsedIdInput;
        
    }
    
}
