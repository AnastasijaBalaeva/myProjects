package com.examples.rectangle;

import com.examples.MyPoint.MyPoint;
import com.examples.MyTriangle.MyTriangle;
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

        Rectangle rectangle3 = new Rectangle(4.0f, 5.0f);
        Rectangle rectangle4 = new Rectangle(4.0f, 5.0f);

        System.out.println(rectangle3 == rectangle4);
        System.out.println(rectangle3.equals(rectangle4));
        System.out.println("rectangle3 hashCode " + rectangle3.hashCode());
        System.out.println("rectangle4 hashCode " + rectangle4.hashCode());
    }
}
