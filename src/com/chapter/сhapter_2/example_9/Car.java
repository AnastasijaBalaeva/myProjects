package com.chapter.сhapter_2.example_9;

public class Car {
    private int distance;
    private int fuel_level;
    private int consumption;

    public Car(int consumption) {
        this.consumption = consumption;
        this.fuel_level = 0;
        this.distance = 0;
    }

    public void drive(int miles) {


        if (fuel_level <= 0)
        {
            System.out.println("No fuel");
            return;
        }
        distance += Math.min(miles, fuel_level * consumption);
        fuel_level = Math.max(0, fuel_level - miles / consumption);
        System.out.println("Good driver");

    }

    public void refuel(int gallons) {
        this.fuel_level += gallons;
        if (fuel_level >= 100)
            fuel_level = 100;
    }


    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", fuel_level=" + fuel_level +
                ", consumption=" + consumption +
                '}';
    }
}
