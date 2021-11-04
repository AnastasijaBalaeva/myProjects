package com.examples.circle;

import java.util.Objects;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public  Circle(double radius){
        this.radius = radius;
    }
   public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
   }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea(){
       return Math.PI* Math.pow(radius,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0
                && Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result +  Double.hashCode(radius);
        result = 31*result + color.hashCode();

        return result;
    }
}
