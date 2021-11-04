package com.examples.circle;

import com.examples.Ball.Ball;

public class Main {
    public static void main(String[] args){

        Circle circle1 = new Circle();
        System.out.println("default radius = " + circle1.getRadius());
        circle1.setRadius(3.0);
        System.out.println("new radius = " + circle1.getRadius());
        System.out.println("default color = " + circle1.getColor());
        circle1.setColor("green");
        System.out.println("new color = " + circle1.getColor());
        System.out.println("toString = " + circle1.toString());
        System.out.println("getAreas = " + circle1.getArea());
        System.out.println("____________");
        Circle circle2 = new Circle(2.0);
        System.out.println("radius = " + circle2.getRadius());
        System.out.println("default color = " + circle2.getColor());
        System.out.println("toString = " + circle2.toString());
        System.out.println("getAreas = " + circle2.getArea());
        System.out.println("____________");
        Circle circle3 = new Circle(5.0, "blue");
        System.out.println("radius = " + circle3.getRadius());
        System.out.println("color = " + circle3.getColor());
        System.out.println("toString = " + circle3.toString());
        System.out.println("getAreas = " + circle3.getArea());

        Circle circle4 = new Circle(3.0);
        Circle circle5 = new Circle(3.0);

        System.out.println(circle4 == circle5);
        System.out.println(circle4.equals(circle5));
        System.out.println("circle4 hashCode " + circle4.hashCode());
        System.out.println("circle5 hashCode " + circle5.hashCode());

    }
}


