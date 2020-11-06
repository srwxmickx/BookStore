/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class menuBooks {

    ListOfBooks bookstore = new ListOfBooks();
    Scanner input = new Scanner(System.in);
    int select;
    String menuList = "\n\t: BookStore :\n\n"
            + "1.Add new book to stock\n"
            + "2.Sell a book in stock\n"
            + "3.Add Quantity a books\n"
            + "4.Show list the title of all the books in stock\n"
            + "5.List all the information about the books in stock\n"
            + "6.Print out the total income of the bookstore\n"
            + "7.EXIT..\n";

    public void menuList() {
        do {
            System.out.println("\n" + menuList);
            System.out.print("Select your option : ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("\nEnter a title of book : ");
                    String title = input.next();
                    System.out.print("Enter a price of book : ");
                    double price = input.nextInt();
                    System.out.print("Enter a quantity of book : ");
                    int quantity = input.nextInt();
                    Book book = new Book(title, price, quantity);
                    bookstore.addNewBook(book);
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
                    System.out.println("\n\t: Add Quantity a books : ");
                    System.out.print("Enter a title your want to add quantity : ");
                    String a_title = input.next();
                    System.out.print("Enter amount of quantity your want to add : ");
                    int a_quantity = input.nextInt();
                    bookstore.addBookQuantity(a_title, a_quantity);
                    break;
                case 4:
                    System.out.println("\n\t: List of Titles : ");
                    bookstore.listTitles();
                    break;
                case 5:
                    System.out.println("\n\t: List information of books : \n");
                    bookstore.listBooks();
                    break;
                case 6:
                    bookstore.getIncome();
                    break;
            }

        } while (select != 7);

    }
}
