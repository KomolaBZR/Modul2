package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetTask1RemoveDuplicates {

    //  Task 1 (Set)
    //С использованием множеств (Set) реализовать функцию,
    // которая вернет список без повторяющихся элементов:
    //List<String> removeDuplicates(List<String> input)
    //Пример: {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} ->
    // -> {“Ivan”, “Maria”, “Piotr”,“Anna”}

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        System.out.println(list + " -> " + removeDuplicates(list));
    }

    public static List<String> removeDuplicates(List<String> input) {
        if (input != null) {
        List<String> duplicateRemover = new ArrayList<>(new HashSet<>(input));
        return duplicateRemover;
        }else return null;
    }
}
