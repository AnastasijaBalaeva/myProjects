package com.examples.Ball;

import java.util.Objects;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }
    public int getWidth() {
        return x2 - x1;
    }
    public int getHeight() {
        return y2 - y1;
    }
    public boolean coliders(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() + ball.getRadius() >= this.x2)
        {
            ball.reflectHorizontal();
            return true;
        }

        if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() + ball.getRadius() >= this.y2)
        {
            ball.reflectVertical();
            return true;
        }

        return false;
    }
    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return x1 == container.x1
                && y1 == container.y1
                && x2 == container.x2
                && y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + x1;
        result = 31*result + y1;
        result = 31*result + x2;
        result = 31*result + y2;
        return result;

    }
}
