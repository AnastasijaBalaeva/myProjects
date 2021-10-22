package com.examples.employee;

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

    }
}
