package com.examples.rectangle;

import com.examples.circle.Circle;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        System.out.println("default length = " + rectangle1.getLength());
        rectangle1.setLength(2.0f);
        System.out.println("new length = " + rectangle1.getLength());
        System.out.println("default width = " + rectangle1.getWidth());
        rectangle1.setWidth(2.0f);
        System.out.println("new color = " + rectangle1.getWidth());
        System.out.println("getAreas = " + rectangle1.getArea());
        System.out.println("getPerimeter = " + rectangle1.getPerimeter());
        System.out.println("toString = " + rectangle1.toString());
        System.out.println("____________");

        Rectangle rectangle2 = new Rectangle(4.0f, 3.0f);
        System.out.println("length = " + rectangle2.getLength());
        System.out.println("width = " + rectangle2.getWidth());
        System.out.println("getAreas = " + rectangle2.getArea());
        System.out.println("getPerimeter = " + rectangle2.getPerimeter());
        System.out.println("toString = " + rectangle2.toString());
    }
}
