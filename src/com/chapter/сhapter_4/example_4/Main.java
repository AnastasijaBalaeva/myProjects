package com.chapter.сhapter_4.example_4;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2.0, 1.0);
        Point point2 = new Point(3.0, 5.0);

        Circle circle = new Circle(point1, 6);
        System.out.println("circle = " + circle.getCenter());
        circle.moveBy(5, 0);
        System.out.println("moveBy circle = " + circle.getCenter());

        Rectangle rectangle = new Rectangle(point1, 3.0, 12);
        System.out.println("rectangle = " + rectangle.getCenter());
        rectangle.moveBy(5, 0);
        System.out.println("moveBy rectangle = " + rectangle.getCenter());

        Line line = new Line(point1, point2);
        System.out.println("line = " + line.getCenter());
        line.moveBy(5, 0);
        System.out.println("moveBy line = " + line.getCenter());
    }
}
