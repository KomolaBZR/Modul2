package com.company;

import java.time.LocalDate;
import java.util.function.*;

public class LambdaExpressions {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = (a) -> {
            return a * a;
        };
        System.out.println("Task1 (5 -> 25): " + f1.apply(5));
        Function<String, Integer> f2 = (s) -> {
            return s.length() % 2;
        };
        System.out.println("Task2 (\"abcde\" -> 1): " + f2.apply("abcde"));
        UnaryOperator<String> f3 = (s) -> {
            return s.toUpperCase();
        };
        System.out.println("Task3 (\"ivan\" -> \"IVAN\"): " + (String)f3.apply("ivan"));
        BiFunction<String, String, Integer> f4 = (s1, s2) -> {
            return s1.length() + s2.length();
        };
        System.out.println("Task4 (\"abc\", \"de\" -> 5): " + f4.apply("abc", "de"));
        BiConsumer<String, String> f5 = (s1, s2) -> {
            System.out.println(s1.length() + s2.length());
        };
        Supplier<LocalDate> d = LocalDate::now;
        System.out.println("Task6 (\"2020-05-30\"): " + ((LocalDate)d.get()).minusMonths(5L).plusDays(17L));
        UnaryOperator<String> f7 = (s) -> {
            return s.length() % 2 == 0 ? s.substring(0, s.length() / 2) : "";
        };
        System.out.println("Task7 (even=even/2; odd=\"\"): even \"abcd\"-> " + (String)f7.apply("abcd") + ", odd \"abcde\" -> " + (String)f7.apply("abcde"));
        Supplier<Integer> f8 = () -> {
            return (int)(Math.random() * 1000.0D + 1.0D);
        };
        System.out.println("Task8 (random number): " + f8.get());
        UnaryOperator<String> f9 = (s) -> {
            return (new StringBuilder(s)).reverse().toString();
        };
        System.out.println("Task9 (reversed string: \"abc\" ->\"cba\"): " + (String)f9.apply("abc"));
        Function<Integer, Integer> f10 = (a) -> {
            int rvs;
            for(rvs = 0; a > 0; a = a / 10) {
                rvs += a % 10;
                rvs *= 10;
            }

            return rvs / 10;
        };
        System.out.println("Task10 (return a reversed number: 12345 -> 54321): 12345 ->" + f10.apply(12345));
        Predicate<Integer> f11 = (a) -> {
            return a % 2 == 0;
        };
        System.out.println("Task11 (even number->true, odd number->false): 6 -> " + f11.test(6) + ", 25-> " + f11.test(25));
        Function<String, Boolean> f12 = (s) -> {
            return s.length() > 3;
        };
        System.out.println("Task12: (\"ab\" -> false, \"abc\" -> true): ab ->" + f12.apply("ab") + ", abc -> " + f12.apply("abc"));
        BiPredicate<String, Integer> f13 = (s, x) -> {
            return s.length() > x;
        };
        System.out.println("Task13: 1. String more than xhomeworks vs x = 5 -> " + f13.test("homeworks", 5) + "\n  2. String more than xtask vs x = 5 -> " + f13.test("task", 5));
    }
}
