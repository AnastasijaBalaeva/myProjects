package com.chapter.four.example4;

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
