package com.company;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Books book = new Books();
        Students student = new Students();
        Library library = new Library();

        int choice = -1;
        while(choice != 7){
            System.out.println("Select one of following items");
            System.out.println("1: Add book");
            System.out.println("2: Add student");
            System.out.println("3: Assign a book to student");
            System.out.println("4: Remove to a book from particular student");
            System.out.println("5: Information about all books and student in Library");
            System.out.println("6: All books that's currently assigned to a student");
            System.out.println("7: Exit");

            choice = in.nextInt();
            String choose;
            switch (choice){
                case 1:
                    book.run();
                    break;
                case 2:
                    student.runStudent();
                    break;
                case 3:
                    student.list();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default: choose = "You haven't chosen correctly";
            }
        }

    }
}
