package com.chapter.сhapter_3.example_1;

import java.util.stream.Stream;

public class Main {
    public static void main(String args[])
    {
        Employee[] employees = {
                new Employee("Alla", 50.00f),
                new Employee("Nikita", 35.80f),
                new Employee("Sasha", 76.80f),
        };
        double avarage = Employee.avarage(employees);

        Stream.of(employees).forEach(System.out::println);
        System.out.println("Avarage salary: " + avarage + "$");

    }
}
