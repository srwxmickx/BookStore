
package bookstore;

import java.util.Scanner;

public class ListOfBooks {
           private Book[] books; // อาเรย์เก็บลิสหนังสือ
           private int totalBooks ; //จำนวนหนังสือทั้งหมด
           private double totalIncome = 0; //รายได้รวม
           private boolean checkstock;
           private double totalReceive = 0;
           public ListOfBooks(){
               books = new Book[100];
               totalBooks = 0;
               totalIncome = 0;
           }
           
           public void addNewBook(Book addBook){ //เพิ่มชื่อหนังสือ
               books[totalBooks] = addBook;
               totalBooks++;
               System.out.println("\n book is already in stock.");
               /*for(int i=0;i<totalBooks;i++){
                   if(addBook.getTitle().equals(books[i].getTitle())){
                       String name = addBook.getTitle();  
                       System.out.println("books is already in stock.");                    
                   }               
               }*/
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
         
           public boolean sellBook(String title,int quantity){ //ขายหนังสือ - ลดจำนวน quantity ลง
               boolean checkstock = checkInStock(title,quantity);
               if(checkstock){
               for(int i=0;i<totalBooks;i++){ 
                   if(title.equals(books[i].getTitle())){
                       books[i].buy(quantity);
                      // totalIncome += (books[i].getPrice())*quantity;
                       totalReceive = ((books[i].getPrice())*quantity);
                       System.out.println("\nbooks is sold.\nAmount received : " + totalReceive);
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
