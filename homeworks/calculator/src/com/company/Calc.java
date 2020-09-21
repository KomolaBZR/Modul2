package com.company;

public class Calc {

    private int a;
    private int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static int add(int c, int d){

        return c+d;
    }
    public int add(){
        return a+b;
    }

    public static void main(String[] args){
        Calc calc =new Calc(10,20);
        System.out.println(calc.add());

        System.out.println(Calc.add(20,30));
    }
}
