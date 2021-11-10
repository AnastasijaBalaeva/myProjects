package com.chapter.сhapter_3.example_2;


public class Main {
    public static void main(String args[])
    {
        Employee[] employees = {
                new Employee("Alla", 50.00f),
                new Employee("Nikita", 35.80f),
                new Employee("Sasha", 76.80f),
        };

        Employee employee = (Employee) Employee.largest(employees);
        System.out.println("Max salary = " + employee.getName());

    }
}
