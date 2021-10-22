package com.examples.Ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float)(Math.cos(Math.PI * direction / 180) * speed);
        yDelta = (float)(Math.sin(Math.PI * direction / 180) * speed);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
        System.out.println("Move one step : x = " +x+" y = " +y);
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
        System.out.println( "x = " + xDelta);
    }
    public void reflectVertical() {
        yDelta = -yDelta;
        System.out.println("y = " +yDelta);
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(x=" + x +
                ", y=" + y + "), " +
                " speed = (" + xDelta + "," +yDelta +
                ")]";
    }
}
