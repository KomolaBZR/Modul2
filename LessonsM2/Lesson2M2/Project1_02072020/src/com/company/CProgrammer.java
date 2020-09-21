package com.company;

public class CProgrammer extends Programmer{
    public CProgrammer(String name, double salary) {

        super(name,salary);
    }
    public void codeReview(){
        System.out.println("this C code is good");
    }
}
