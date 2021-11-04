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
        // equals and hashCode
        Ball ball1 = new Ball(10, 10, 5, 3, 2);
        Ball ball2 = new Ball(10, 10, 5, 3, 2);

        System.out.println(ball1 == ball2);
        System.out.println(ball1.equals(ball2));
        System.out.println("ball1 hashCode " + ball1.hashCode());
        System.out.println("ball2 hashCode " + ball2.hashCode());

        Container container1 = new Container(0, 0, 20, 20);
        Container container2 = new Container(0, 0, 20, 20);
        System.out.println(container1 == container2);
        System.out.println(container1.equals(container2));
        System.out.println("container1 hashCode " + container1.hashCode());
        System.out.println("container2 hashCode " + container2.hashCode());

        System.out.println(ball1.equals(container2));

    }
}
