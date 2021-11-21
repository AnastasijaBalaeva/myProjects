package com.chapter.four.example5;

public abstract class Shape {
    protected Point point;
    public Shape()
    {
        point = new Point(0, 0);
    }
    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }
    public abstract Point getCenter();
}
