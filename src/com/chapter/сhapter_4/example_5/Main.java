package com.chapter.сhapter_4.example_5;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2.0, 1.0);
        Point point2 = new Point(3.0, 5.0);

        Circle circle = new Circle(point1, 6);
        System.out.println("circle = " + circle.getCenter());
        System.out.println("circle clone = " + circle.clone().getCenter());

        Rectangle rectangle = new Rectangle(point1, 3.0, 12);
        System.out.println("rectangle = " + rectangle.getCenter());
        System.out.println("rectangle clone = " + rectangle.clone().getCenter());

        Line line = new Line(point1, point2);
        System.out.println("line = " + line.getCenter());
        System.out.println("line clone = " + line.clone().getCenter());

    }
}
