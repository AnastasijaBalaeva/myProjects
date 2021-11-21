package com.chapter.two.example9;

public class ModelsCar {
    public static void main(String[] args) {
        Car car = new Car(20);
        car.refuel(10);
        car.drive(60);
        System.out.println(car);


    }
}
