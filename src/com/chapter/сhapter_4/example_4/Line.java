package com.chapter.сhapter_4.example_4;

public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to)
    {
        super(from);
        this.to=to;
    }

    @Override
    public Point getCenter() {
        point = new Point((this.point.x+to.x)/2, (this.point.y+to.y)/2);
        return point;
    }
}