package com.company;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class MethodReferences {
    public static void main(String[] args) {
        PrintStream var10000 = System.out;
        Consumer<String> printer = var10000::println;
        System.out.print("Task1: ");
        printer.accept("Print this string");
        Function<String, String> task2 = String::toLowerCase;
        System.out.println("Task2: " + (String)task2.apply("LOWERCAse"));
        Function<Integer, Double> task3 = Math::sqrt;
        System.out.println("Task3: (50)^1/2 -> " + task3.apply(50));
        System.out.println("Task3: (25)^1/2 -> " + task3.apply(25));
        Function<String, String> task4 = MethodReferences::lambdaExpressionsTask7;
        lambdaExpressionsTask7("asdfg");
        System.out.println("Task4 (even=even/2; odd=\"\"): even \"abcd\"-> " + (String)task4.apply("abcd") + ", odd \"abcde\" -> " + (String)task4.apply("abcde"));
        Employee employee = new Employee("John", 5000);
        Supplier<Integer> supplier = employee::getSalary;
        System.out.println("Task 5 (1. Supplier): " + supplier.get());
        Function<Employee, Integer> task5 = Employee::getSalary;
        System.out.println("Task 5 (2. Function): " + task5.apply(employee));
    }

    public static String lambdaExpressionsTask7(String s) {
        return s.length() % 2 == 0 ? s.substring(0, s.length() / 2) : "";
    }
}
