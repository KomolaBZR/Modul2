package com.company;

import java.util.*;

public class SetTask2getDuplicates {
    //Task 2 (Set)
    //С использованием множеств реализовать функцию,
    // которая вернет повторяющиеся элементы из данного списка:
    //List<String> getDuplicates(List<String> input)
    //Пример: {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} -> {“Ivan”, “Maria”}

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        System.out.println(list + " -> " + getDuplicates(list));
    }

    public static List<String> getDuplicates(List<String> input){
        if (input != null) {
            Set<String> duplicateRemover = new HashSet<>();
            List<String> duplicate=new ArrayList<>();
                for (String str: input){
                    if(!duplicateRemover.add(str)){
                    duplicate.add(str);
                    }
                }
                return duplicate;
        }else return null;
    }
}
