package com.company;

public class StringDemo {
    public static void main(String[] args) {
        String s="hello";
        String s1="hello";
        String s2=new String("hello");


        System.out.println(s==s1);         //true
        System.out.println(s==s2);         //false
        System.out.println(s.equals(s1));  //true
        System.out.println(s.equals(s2));  //true


        s=s.toUpperCase();
        System.out.println(s==s1);
        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();
        //stringBuilder.

    }
}
