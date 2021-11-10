package com.chapter.сhapter_4.example_4;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height)
    {
        super(topLeft);
        this.width=width;
        this.height=height;
    }

    @Override
    public Point getCenter() {
        point = new Point(this.point.x+width/2, this.point.y+height/2);
        return point;
    }

}
