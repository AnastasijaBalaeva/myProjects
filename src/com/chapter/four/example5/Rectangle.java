package com.chapter.four.example5;

public class Rectangle extends Shape implements Cloneable {
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
    @Override
    public Rectangle clone() {
        try {
            Rectangle cloned = (Rectangle) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            return cloned;
        } catch (CloneNotSupportedException ex) {
            System.out.println("qq");
            return null;
        }
    }

}
