package com.company;


import java.time.LocalDate;
import java.util.function.*;


public class LambdaExpressions {
    public static void main(String[] args) {
        // 1.Given an integer, return a power of integer: 5 -> 25
        Function<Integer, Integer> f1=(a)->a*a;
        System.out.println("Task1 (5 -> 25): "+f1.apply(5));

        //2.Given a string, return modulo 2 of
        // string length: "abcde" -> 1
        Function<String, Integer> f2 = (s) -> s.length() % 2;
        System.out.println("Task2 (\"abcde\" -> 1): "+f2.apply("abcde"));


        //3.Given a string, return its in upper case: "ivan" -> "IVAN"
        UnaryOperator<String> f3 = (s) -> s.toUpperCase();
        System.out.println("Task3 (\"ivan\" -> \"IVAN\"): "+f3.apply( "ivan"));

        //4.Given 2 strings, return a sum of their lengths: "abc", "de" -> 5
        BiFunction<String, String, Integer> f4 = (s1, s2) -> s1.length() + s2.length();
        System.out.println("Task4 (\"abc\", \"de\" -> 5): "+f4.apply( "abc", "de"));

        //5.Given 2 strings, print a sum of their lengths.
        BiConsumer<String,String> f5=(s1, s2) -> System.out.println(s1.length() + s2.length());


        //6.Return a date of one week prior to today: "2020-05-30" //supplier

        Supplier<LocalDate> d=LocalDate::now;
        // LocalDate date = LocalDate.now().minusMonths(5).plusDays(17);
        System.out.println("Task6 (\"2020-05-30\"): " +d.get().minusMonths(5).plusDays(17));
        // System.out.println("Task6 (\"2020-05-30\"): "+date);

        //7.	Given a string, return a string, which consists of a first half of its character, if length is even, returns an empty string otherwise: "abcd" -> "ab", "abcde" -> "".
        UnaryOperator<String> f7=(s)->(s.length()%2==0)?s.substring(0,s.length()/2):"";
        System.out.println("Task7 (even=even/2; odd=\"\"): " +"even \"abcd\"-> "+f7.apply("abcd")+", odd \"abcde\" -> " +f7.apply("abcde"));


        //8.	Return a random number //(Math.random()*((max-min)+1))+min;
        Supplier<Integer> f8=()-> (int)((Math.random()*((1000-1)+1))+1);
        System.out.println("Task8 (random number): "+f8.get());


        //9.	Given a string, return a reversed string: "abc" ->"cba"
        UnaryOperator<String> f9 = (s) -> new StringBuilder(s).reverse().toString();
        System.out.println("Task9 (reversed string: \"abc\" ->\"cba\"): "+f9.apply("abc"));

        //10.	Given a number, return a reversed number: 12345 -> 54321
        Function<Integer, Integer> f10 = (a) -> {
            int rvs = 0;
            while (a > 0) {
                rvs = rvs + a % 10;
                rvs = rvs * 10;
                a = a / 10;
            }
            return rvs / 10;
        };
        System.out.println("Task10 (return a reversed number: 12345 -> 54321): 12345 ->" +
                f10.apply(12345));



        //11.Given a number, return true if it is even, false otherwise: 6 -> true, 25 -> false

        Predicate<Integer> f11=(a)-> a%2==0;
        System.out.println("Task11 (even number->true, odd number->false): "+ "6 -> "+f11.test(6)+", 25-> "+ f11.test(25));


        //12.Given a string, return true, if its length is more than 3, false otherwise: "ab" -> false, "abc" -> true
        Function<String, Boolean> f12 = s -> s.length() > 3;
        System.out.println("Task12: (\"ab\" -> false, \"abc\" -> true): " + "ab ->"+ f12.apply("ab")+", abc -> " + f12.apply("abc"));


        //13.Given a string and a number x. Return true, if length of string is more than x, false otherwise. Hint: BiPredicate.
        BiPredicate<String, Integer> f13 = (s, x) -> s.length()>x;
        System.out.println("Task13: " + "1. String more than x"+ "homeworks" +" vs x = 5 -> "
                +f13.test("homeworks",5)+
                "\n  2. String more than x"+ "task" +" vs x = 5 -> "
                +f13.test("task",5));

    }
}
