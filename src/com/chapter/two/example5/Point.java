package com.chapter.two.example5;

public class Point {
    private double  x;
    private double  y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        Point point = new Point(this.x+x, this.y+y);
        return point;
    }

    public Point scale(double scale) {
        Point point = new Point(this.x*scale, this.y*scale);
        return point;
    }

}
