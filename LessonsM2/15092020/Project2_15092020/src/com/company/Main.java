package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<Person> list1=new ArrayList<>();
	    list1.add(new Person("Oleg"));
        list1.add(new Person("Lora"));
        list1.add(new Person("Oleg"));
        list1.add(new Person("David"));

        List<Person> list2=new ArrayList<>();
        list2.add(new Person("Oleg"));
        list2.add(new Person("Lora"));
        list2.add(new Person("Anna"));
        list2.add(new Person("Roma"));
    }

    public static List<Person> getNewListOfDuplicatedPersons(List<Person> list1, List<Person> list2){

        Set<Person> set1=new HashSet<>(list1);
        Set<Person> set2=new HashSet<>();

        set1.retainAll(set2);
        List<Person> result=new ArrayList<>(set1);
        return result;
    }
}
