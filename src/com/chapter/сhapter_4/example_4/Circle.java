package com.chapter.сhapter_4.example_4;

public class Circle extends Shape{
    private double radius;

    public Circle(Point center, double radius)
    {
        super(center);
        this.radius=radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }
}
