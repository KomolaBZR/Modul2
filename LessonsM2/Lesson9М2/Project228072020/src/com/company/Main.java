package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[] {
                "Иванов Иван Петрович",
                "Перров Петр",
                "Николаев",
                "Сидоров Джон Иванович"};
        Person[] persons=getPersonFromArrayOfString(names);
        System.out.println(Arrays.toString(persons));
        System.out.println("--------------------------------");
        printPerson(persons);
    }

    public static Person[] getPersonFromArrayOfString(String[] names){
        Person[] persons=null;
        if(names!=null) {
            persons = new Person[names.length];
            for(int i=0; i<names.length;++i){
                String[] nameStrings = names[i].split(" ");
                switch (nameStrings.length){
                    case 1: persons[i] =new Person(nameStrings[0]); break;
                    case 2: persons[i] =new Person(nameStrings[0], nameStrings[1]); break;
                    case 3: persons[i] =new Person(nameStrings[0], nameStrings[1], nameStrings[2]); break;
                    default:
                        System.out.println("404");
                }
            }
        }
        return persons;
    }
    public static void printPerson(Person[] persons){
        for (Person p: persons) {
            System.out.println(p.toShortString());
        }
    }
}
