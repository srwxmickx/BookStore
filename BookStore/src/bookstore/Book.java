
package bookstore;

import java.util.Scanner;

public class Book {
    private String title; //ชื่อหนังสือ
    private double price; //ราคา
    private int quantity; //ปริมาณ
    public Book(String title,double price,int quantity){
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void addQuantity(int amount){ // เพิ่มจำนวนหนังสือ
        quantity += amount;
    }
    public void buy(int amount){
        quantity -= amount;
    }
   
    
    @Override
    public String toString() {
        return "\nTitle : " + title  +  "\t" + "Price : " + price + "\t"+ "InStock : "+quantity;
        
    }
    
}
