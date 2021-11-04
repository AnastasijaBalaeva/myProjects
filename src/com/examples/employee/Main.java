package com.examples.employee;

import com.examples.circle.Circle;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee(1, "Ivan", "Ivanov", 10000);
        System.out.println("getID = " + employee.getId());
        System.out.println("getFirstName = " + employee.getFirstName());
        System.out.println("getLastName = " + employee.getLastName());
        System.out.println("getName = " + employee.getName());
        System.out.println("default getSalary = " + employee.getSalary());
        employee.setSalary(15000);
        System.out.println("new getSalary = " + employee.getSalary());
        System.out.println("getAnnualSalary = " + employee.getAnnualSalary());
        System.out.println("raiseSalary = " + employee.raiseSalary(10));
        System.out.println("toString = " + employee.toString());

        Employee employee1 = new Employee(1, "Ivan", "Ivanov", 10000);
        Employee employee3 = new Employee(1, "Ivan", "Ivanov", 10000);

        System.out.println(employee1 == employee3);
        System.out.println(employee1.equals(employee3));
        System.out.println("employee1 hashCode " + employee1.hashCode());
        System.out.println("employee3 hashCode " + employee3.hashCode());
    }
}
