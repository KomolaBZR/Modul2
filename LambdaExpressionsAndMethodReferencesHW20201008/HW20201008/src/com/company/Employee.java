package com.company;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString() {
        return "Employee: " + this.name + ", salary: " + this.salary + "Euro";
    }
}

