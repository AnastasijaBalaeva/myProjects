package com.examples.MyPoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        MyPoint myPoint = new MyPoint();
        System.out.println("default getX = " + myPoint.getX());
        myPoint.setX(2);
        System.out.println("new getX = " + myPoint.getX());
        System.out.println("default getY = " + myPoint.getY());
        myPoint.setY(1);
        System.out.println("new getY = " + myPoint.getY());
        System.out.println("new getXY = " + Arrays.toString(myPoint.getXY()));
        myPoint.setXY(4,3);
        System.out.println("new getXY = " + Arrays.toString(myPoint.getXY()));
        System.out.println("toString = " + myPoint.toString());
        System.out.println("distance from this point to the given point at = " + myPoint.distance(5,4));
        System.out.println("distance from this point to the given  instance MyPoint = " + myPoint.distance(new MyPoint(3,5)));
        System.out.println("distance from this point to (0,0) = " + myPoint.distance());
        System.out.println("_______________");

        MyPoint myPoint1 = new MyPoint();
        System.out.println("default getX = " + myPoint1.getX());
        myPoint1.setX(3);
        System.out.println("new getX = " + myPoint1.getX());
        System.out.println("default getY = " + myPoint1.getY());
        myPoint1.setY(2);
        System.out.println("new getY = " + myPoint1.getY());
        System.out.println("new getXY = " + Arrays.toString(myPoint1.getXY()));
        myPoint1.setXY(5,6);
        System.out.println("new getXY = " + Arrays.toString(myPoint1.getXY()));
        System.out.println("toString = " + myPoint1.toString());
        System.out.println("distance from this point to the given point at = " + myPoint1.distance(8,9));
        System.out.println("distance from this point to the given  instance MyPoint = " + myPoint1.distance(new MyPoint(6,6)));
        System.out.println("distance from this point to (0,0) = " + myPoint1.distance());


    }
}
