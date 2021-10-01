package com.company;
import java.util.Scanner;
public class Books {
    public String title;
    public String author;
    public String isbn;
    public int year;
    public int quantity;

    public void run(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the title of book");
        title = in.next();
        System.out.println("Input the author of book");
        author = in.next();
        System.out.println("Input the isbn of book");
        isbn = in.next();
        System.out.println("Input the year");
        year = in.nextInt();
        System.out.println("Input the quantity of book");
        quantity = in.nextInt();
        System.out.println("Title is " + title + ", author is " + author + ", isbn is " + isbn + ", year is " + year + ", quantity are " + quantity);
    }
}
