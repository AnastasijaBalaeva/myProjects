package com.chapter.сhapter_3.example_1;

public class Employee implements Measurable{
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


    public static double avarage(Measurable[] objects)
    {
        double salary_Sum = 0.0f;
        for(int i=0; i< objects.length; i++)
        {
            Employee employee = (Employee) objects[i];
            salary_Sum += employee.getMeasure();
        }
        return (salary_Sum/objects.length);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name_employees='" + name_employees + '\'' +
                '}';
    }
}
