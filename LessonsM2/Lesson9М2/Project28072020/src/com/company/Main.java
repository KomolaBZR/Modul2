package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[] {"John Johnson","Jack Cooper Petrovich", "Bobov"};
        Person[] persons=personArray(names);
        printArrayCard1(persons);

    }
    public static Person[] personArray(String[] array){
        Person[] persons = new Person[array.length];
        for(int i=0; i<array.length; i++){
            String[] rez = array[i].split(" ");
            persons[i]= new Person(rez[1],rez[0],rez[3]);

        }


        return persons;
    }




    public static void printArrayCard1(Person[] persons){
        for (Person person: persons) {
            System.out.println(person.toString());
        }
    }

}


    /*дан массив из строк, каждая строка может
    содержать Фамилия Имя Отчество или только
    Фамилия Имя или только Фамилия.
    Получить массив Person и вывести на экран как показано */

