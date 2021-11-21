package com.chapter.four.example5;

public class Line extends Shape implements Cloneable{
    private Point from, to;

    public Line(Point from, Point to)
    {
        super(from);
        this.from = from;
        this.to=to;
    }

    @Override
    public Point getCenter() {
        point = new Point((this.point.x+to.x)/2, (this.point.y+to.y)/2);
        return point;
    }
    @Override
    public Line clone() {
        try {
            Line cloned = (Line) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            cloned.from = new Point(from.getX(), from.getY());
            cloned.to = new Point(to.getX(), to.getY());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}