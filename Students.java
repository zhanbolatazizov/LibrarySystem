package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    Books book = new Books();
    public int id;
    public String name;
    public String surname;
    public String group;
    public ArrayList<String> borrowedBook = new ArrayList<>();
    public void runStudent(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the id of student");
        id = in.nextInt();
        System.out.println("Input the name of student");
        name = in.next();
        System.out.println("Input the surname of student");
        surname = in.next();
        System.out.println("Input the group of student");
        group = in.next();
        System.out.println("Student: " + name + surname + ", id is " + id + ", group " + group);
    }


    public void list(){
        Scanner in = new Scanner(System.in);

        System.out.println("Input the name of student");
        borrowedBook.add(name = in.next());
        System.out.println("Input the name of book");
        borrowedBook.add(book.title = in.next());
        for(String num: borrowedBook){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
