package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2ReturnListOfNamesWithoutNamesWith4Letters {
    //Task 2 (List)
    // Есть список с именами: Ivan, Maria, Stephan, John, Amalia.
    // Написать функцию, которая вернет список,
    // в котором не содержатся имена исходного списка, длиной 4.

    public static void main(String[] args) {
        /*List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Maria");
        names.add("Stephan");
        names.add("John");
        names.add("Amalia");*/

        List<String> names = Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia");
        System.out.println(sortNamesByLength(names));
    }

    public static List<String> sortNamesByLength(List<String> names){
        if(names!=null){
            List<String> sortedNames = new ArrayList<>();
            for(String name:names){
                if(name.length()>4){
                    sortedNames.add(name);
                }
            }
            return sortedNames;
        } else{return null;}
    }

}
