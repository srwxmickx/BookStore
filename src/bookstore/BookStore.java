/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListOfBooks bookstore = new ListOfBooks();
        int select;
        do{
            System.out.println("\t: Amorn Peam Mick BookStore :\n");
            System.out.println("1.Add new book to stock");  
            System.out.println("2.Sell a book in stock");
            System.out.println("3.Add Quantity a books");
            System.out.println("4.Show list the title of all the books in stock");
            System.out.println("5.List all the information about the books in stock");
            System.out.println("6.Print out the total income of the bookstore");
            System.out.println("7.EXIT..");
            System.out.print("Select your option : ");
            select = input.nextInt();
            switch(select){
                case 1:
                    System.out.print("Enter a title of book : ");
                    String title = input.next();
                    System.out.print("Enter a price of book : ");
                    double price = input.nextInt();
                    System.out.print("Enter a quantity of book : ");
                    int quantity = input.nextInt();
                    Book book = new Book(title,price,quantity);
                    bookstore.addNewBook(book);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Selling books :");
                    System.out.print("Enter a title want to sell : ");
                    String s_title = input.next();
                    System.out.print("Enter a quantity : ");
                    int s_quan = input.nextInt();
                    bookstore.sellBook(s_title, s_quan);
                    break;
                case 3:
                    System.out.println("\t: Add Quantity a books : ");      
                    System.out.print("Enter a title your want to add quantity : ");
                    String a_title = input.next();
                    System.out.print("Enter amount of quantity your want to add : ");
                    int a_quantity = input.nextInt();
                    bookstore.addBookQuantity(a_title,a_quantity);
                    break;    
                case 4:
                    System.out.println();
                    System.out.println("\t: List of Titles :");
                    bookstore.listTitles();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("\t: List information of books :");
                    bookstore.listBooks();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Total income of book store : ");
                    bookstore.getIncome();
                    break;
  
            }
            
        }while(select != 7);
               
        
    }
    
}
