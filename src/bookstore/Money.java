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
public class Money {
          private int money;
          
          public int inputMoney(){
              Scanner money = new Scanner(System.in);
              System.out.print("\nInput your money : ");
              int yourmoney = money.nextInt();
              return yourmoney;
              
          }
          
          public void buy(){
              Book[] bk = new Book[5];
              
              if(inputMoney()==10);
                  System.out.println(bk);
              }
          }
    
    
    

