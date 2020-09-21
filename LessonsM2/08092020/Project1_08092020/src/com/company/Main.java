package com.company;

public class Main {

    public static void main(String[] args) {
	Person p1=new Person("qwer",77);
	Person p2=new Person("qwer",20);

	//108003617

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));

    }
}
