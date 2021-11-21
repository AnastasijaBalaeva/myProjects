package com.chapter.three.example2;

public class Employee implements Measurable {
    private double salary;
    private String name_employees;

    public Employee(String name_employees, double salary)
    {
        this.name_employees = name_employees;
        this.salary = salary;
    }


    @Override
    public double getMeasure()
    {
        return salary;
    }

    public String getName()
    {
        return name_employees;
    }
    public static  Measurable largest(Measurable[] objects)
    {
        Employee employee = (Employee) objects[0];
        for(int i=1; i<objects.length; i++)
        {
            Employee other = (Employee) objects[i];
            if (employee.getMeasure() < other.getMeasure())
                employee = other;
        }
        return employee;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name_employees='" + name_employees + '\'' +
                '}';
    }
}
