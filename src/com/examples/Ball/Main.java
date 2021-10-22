package com.examples.Ball;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 10, 5, 3, 2);
        System.out.println("getX + "+ball.getX());
        ball.setX(20);
        System.out.println("new getX + "+ball.getX());
        System.out.println("getY + "+ball.getY());
        ball.setY(20);
        System.out.println("new getY + "+ball.getY());
        System.out.println("getRadius + "+ball.getRadius());
        ball.setRadius(10);
        System.out.println("new getRadius + "+ball.getRadius());
        System.out.println("getXDelta = " + ball.getXDelta());
        ball.setXDelta(50);
        System.out.println("getXDelta = " + ball.getXDelta());
        System.out.println("getYDelta = " + ball.getYDelta());
        ball.setYDelta(50);
        System.out.println("getYDelta = " + ball.getYDelta());
        ball.move();
        ball.reflectHorizontal();
        ball.reflectVertical();
        System.out.println("toString = " + ball.toString());
        System.out.println("______________");


            Container container = new Container(0, 0, 20, 20);
            for (int step = 0; step < 5; ++step) {
                ball.move();
                container.coliders(ball);
                System.out.println(ball);
        }
    }
}
