package com.qa;

public class TestBooks {
    public static void main(String[] args) {



        Book book1 = new Book("Harry potter 1", "JK Rowling", 15.99);
        Book book2 = new Book("Harry potter 2", "JK Rowling", 10.99);
        Book book3 = new Book("Harry potter 3", "JK Rowling", 12.99);


        System.out.println(book1.toString());
        Book[] bookArray = new Book [3];

        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        for(int i=0; i<bookArray.length; i++){
            System.out.println(bookArray[i]);
        }
    }
}
