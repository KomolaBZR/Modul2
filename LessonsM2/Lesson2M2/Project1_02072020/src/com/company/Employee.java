package com.company;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee " + name + "("+ salary + ")";
    }
    public void pay(){
        System.out.println("pay "+ salary+"0 euro for " +name);
    }
    public void pay(int bonus){
        System.out.println("pay "+ (salary+bonus) +"0 euro for " +name);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public abstract void work();
}
