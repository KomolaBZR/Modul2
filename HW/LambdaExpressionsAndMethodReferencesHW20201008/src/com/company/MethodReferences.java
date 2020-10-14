package com.company;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {

    public static void main(String[] args) {

        //1. Print a given string
        Consumer<String> printer = System.out::println;//or System.out::print
        System.out.print("Task1: ");
        printer.accept("Print this string");



        //2. Given a string, return a lower case string

        Function<String,String> task2=String::toLowerCase;
        System.out.println("Task2: "+task2.apply("LOWERCAse"));

        //3. Given a number, return a square root from the number
        Function<Integer,Double> task3=Math::sqrt;
        System.out.println("Task3: (50)^1/2 -> "+ task3.apply(50));
        System.out.println("Task3: (25)^1/2 -> "+ task3.apply(25));

        //4. Implement solution 7 from above as a method reference

        Function<String, String> task4 = MethodReferences::lambdaExpressionsTask7;
        lambdaExpressionsTask7("asdfg");
        System.out.println("Task4 (even=even/2; odd=\"\"): "
                +"even \"abcd\"-> "+task4.apply("abcd")+", odd \"abcde\" -> " +task4.apply("abcde"));


        //5. Given a class Employee with name and salary. Return an employee salary using 1. Supplier, 2. Function.
        Employee employee = new Employee("John", 5000);
        Supplier<Integer> supplier = employee::getSalary;
        System.out.println("Task 5 (1. Supplier): " + supplier.get());
        Function<Employee, Integer> task5 = Employee::getSalary;
        System.out.println("Task 5 (2. Function): " + task5.apply(employee));
    }

    public static String lambdaExpressionsTask7(String s) {
        return (s.length() % 2 == 0) ? s.substring(0, s.length() / 2) : "";
    }
}
