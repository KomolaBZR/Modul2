package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names ={"Jack","Nick","John"};
        System.out.println("Nick".compareTo("John"));


        Arrays.sort(names);
        System.out.println(Arrays.toString(names));



        Book[] authors={
                new Book("Джером Д. Сэлин­джер","Над про­па­стью во ржи",1951),
                new Book("Харпер Ли","Убить пересмешника",196018),
                new Book("Тони Моррисон","Песнь Соломона",1977),
                new Book("Харпер Ли","Пойди, поставь сторожа",2015),
                };

        //System.out.println(people[0].compareTo(people[1]));

        Arrays.sort(authors);
        System.out.println(Arrays.toString(authors));
    }
}
