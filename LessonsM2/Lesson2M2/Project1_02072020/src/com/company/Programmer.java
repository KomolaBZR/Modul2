package com.company;

public class Programmer extends Employee{
    public Programmer(String name, double salary) {

        super(name,salary);
    }

    public void work(){
        System.out.println("programmer: I'm writing code");
    }

    public void codeReview(){
    }

}
