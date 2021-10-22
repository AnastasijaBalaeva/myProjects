package com.examples.book;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Author[] authors = new Author[]{new Author("Ivanov", "Ivanov@gmail.com", 'm'),
                new Author("Petrov", "Petrov@gmail.com", 'm')
        };
        Book book1 = new Book("book1",  authors, 150.0);
        System.out.println("Name book " + book1.getName());
        System.out.println("Authors book " + Arrays.toString(book1.getAuthors()));
        System.out.println("Price book " + book1.getPrice());
        book1.setPrice(2500.0);
        System.out.println("new Price book " + book1.getPrice());
        System.out.println("Qty book " + book1.getQty());
        book1.setQty(1);
        System.out.println("new Qty book " + book1.getQty());
        System.out.println("toString book " + book1.toString());
        System.out.println("AuthorName book " + book1.getAuthorNames());
        System.out.println("_______________________");

        Book book2 = new Book("book2",  authors, 200.0, 2);
        System.out.println("Name book " + book2.getName());
        System.out.println("Authors book " + Arrays.toString(book2.getAuthors()));
        System.out.println("Price book " + book2.getPrice());
        book2.setPrice(1500.0);
        System.out.println("new Price book " + book2.getPrice());
        System.out.println("Qty book " + book2.getQty());
        book2.setQty(3);
        System.out.println("new Qty book " + book2.getQty());
        System.out.println("toString book " + book2.toString());
        System.out.println("AuthorName book " + book2.getAuthorNames());

    }
}
