package com.chapter.сhapter_2.example_5;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.printf("[x=%s;y=%s]", point.getX(), point.getY());
    }
}
