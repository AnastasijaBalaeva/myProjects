package com.examples.book;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty =0;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;

    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }



    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            builder.append(authors[i].getName());
            if (i + 1 != authors.length)
                builder.append(", ");
        }
       return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0
                && qty == book.qty
                && Objects.equals(name, book.name)
                && Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + name.hashCode();
        result = 31*result + Arrays.hashCode(authors);
        result = 31*result + Double.hashCode(price);
        result = 31*result + qty;
        return result;
    }
}
