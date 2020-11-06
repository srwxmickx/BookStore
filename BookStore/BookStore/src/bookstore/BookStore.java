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
        menuBooks books = new menuBooks();
        books.menuList();
    }
}

