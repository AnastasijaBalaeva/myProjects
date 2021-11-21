package com.chapter.four.example4;

public class Point {
    protected double x, y;

    public Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }


    @Override
    public String toString()
    {
        return "[" + x + ", " + y + "]";
    }
}
