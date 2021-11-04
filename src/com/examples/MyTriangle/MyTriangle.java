package com.examples.MyTriangle;

import com.examples.MyPoint.MyPoint;

import java.util.Arrays;
import java.util.Objects;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

        if (Double.compare(d1, d2) == 0  &&  Double.compare(d2, d3) == 0) {
            return "Equilateral";
        }
        else if (Double.compare(d1, d2) == 0 || Double.compare(d1, d3) == 0 || Double.compare(d2, d3) == 0) {
            return "Isosceles";
        }
        return "Scalene";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTriangle that = (MyTriangle) o;
        return Objects.equals(v1, that.v1)
                && Objects.equals(v2, that.v2)
                && Objects.equals(v3, that.v3);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + v1.hashCode();
        result = 31*result + v2.hashCode();
        result = 31*result + v3.hashCode();

        return result;
    }
}
