package com.examples.MyTriangle;

import com.examples.MyPoint.MyPoint;

public class Main {
    public static void main(String[] args){
        MyTriangle myTriangle = new MyTriangle(2,2,2,2,2,2);
        System.out.println("toString = " + myTriangle.toString());
        System.out.println("getPerimeter = " + myTriangle.getPerimeter());
        System.out.println("Equilateral or Isosceles or Scalene = " + myTriangle.getType());
        System.out.println("_____________");

        MyTriangle myTriangle1 = new MyTriangle(new MyPoint(3,3),new MyPoint(3,3),new MyPoint(3,3));
        System.out.println("toString = " + myTriangle1.toString());
        System.out.println("getPerimeter = " + myTriangle1.getPerimeter());
        System.out.println("Equilateral or Isosceles or Scalene = " + myTriangle1.getType());
    }
}
