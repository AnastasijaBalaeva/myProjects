package com.chapter.сhapter_4.example_5;

public class Point {
    protected double x, y;

    public Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    @Override
    public String toString()
    {
        return "[" + x + ", " + y + "]";
    }


}
