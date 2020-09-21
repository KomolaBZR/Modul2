package com.company;

public class Main {

    public static void main(String[] args) {
        Canon5400 p1=new Canon5400();
        Canon5400 p2=new Canon5400();
        Xerox8211 p3=new Xerox8211();
        Xerox8211 p4=new Xerox8211();

        printString("hello interface",p1);
        System.out.println("---------------");
        printString("hello interface",p3);
        System.out.println("---------------");
        System.out.println(p3.scan());

       // p3.print("hello interface");

        //System.out.println("---------------");

    }

    public static void printString(String s, Printer p){
        p.print(s);

    }
}
