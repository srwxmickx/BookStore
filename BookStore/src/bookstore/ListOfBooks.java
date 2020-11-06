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
public class ListOfBooks {
           private Book[] books; // อาเรย์เก็บลิสหนังสือ
           private int totalBooks ; //จำนวนหนังสือทั้งหมด
           private int totalIncome; //รายได้รวม
           private int maxspace = 100; //พื้นที่เก็บนส สูงสุด 100
           private boolean checkstock;
           public ListOfBooks(){
               books = new Book[100];
               totalBooks = 0;
               totalIncome = 0;
           }
           
           public void addNewBook(Book addBook){ //เพิ่มชื่อหนังสือ
               if(maxspace <= totalBooks){
               books[totalBooks] = addBook;
               totalBooks++;
               for(int i=0;i<totalBooks;i++){
                   if(addBook.getTitle().equals(books[i].getTitle())){
                       String name = addBook.getTitle();
                       Scanner input = new Scanner(System.in);
                       System.out.println("books is already in stock");
                       int stock = input.nextInt();
                       addBookQuantity(name,stock);
                   }
                   
               }
               System.out.println("Success logged the book ");
               }else{System.out.println("Not Enough Space for Adding a Book");}
           }
          
           
           public void addBookQuantity(String title,int quantity){ // เพิ่มจำนวนหนังสือ
               for(int i=0;i<totalBooks;i++){
               if(title.equals(books[i].getTitle())){
                   books[i].addQuantity(quantity);
                   System.out.println("Quantity added successfully");
                   return;
               }
               }
               
           }
           public boolean checkInStock(String title,int quantity){
               for(int i = 0 ; i<totalBooks;i++){
                   if(title.equals(books[i].getTitle())) {
                       if(quantity<=books[i].getQuantity()){
                           return true;
                       }
                       else{
                           return false;
                       }
                           
                   }
               }
               return false;
           }
          /* public boolean sellBook(String title,int quantity){
               for(int i=0;i<totalBooks;i++){
                   if(title == books[i].getTitle()){
                       books[i].buy(quantity);
                       double price = books[i].getPrice();
                       double profit = price*quantity; //คำนวณกำไร ราคา*จำนวน
                       totalIncome += profit;
                       System.out.println("books is sold.Total store profits : " + profit);
                   }
               }
               return false;
           }*/
           public boolean sellBook(String title,int quantity){ //ขายหนังสือ - ลดจำนวน quantity ลง
               boolean checkstock = checkInStock(title,quantity);
               if(checkstock){
               for(int i=0;i<totalBooks;i++){ 
                   if(title.equals(books[i].getTitle())){
                       books[i].buy(quantity);
                       totalIncome += (books[i].getPrice())*quantity;
                       System.out.println("\nbooks is sold.Total store profits : " + totalIncome);
                       System.out.println();
                   }
               }
               }else{
                   System.out.println("\nSorry... " + title + " is out of stock.\n");
               }
               return checkstock;
           }
               
           public void listTitles(){ // แสดง list ของชื่อหนังสือ (เฉพาะชื่อ)
               for(int i=0;i<totalBooks;i++){
                   System.out.println(books[i].getTitle());
                  
               }
               
           }
           public void listBooks(){// แสดง list ของชื่อหนังสือ ราคาและปริมาณที่มีอยู่ในร้าน
               for(int i=0;i<totalBooks;i++){
                   System.out.println(books[i].toString());    
               }       
           }
           public double getIncome(){
               return totalIncome;
           }
           
           
}
