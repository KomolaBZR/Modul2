package com.company;

//import java.util.*;

public class Main {

    public static void main(String[] args) {

     /*   List<Person> list=new LinkedList<>();
                            //new ArrayList<>();- аналог bookingList, лежит массив
                             //new LinkedList<>() - лежит Node
        list.add(new Person("person 1"));
        list.add(new Person("person 2"));
        list.add(new Person("person 1"));



        List<Person> list1=new ArrayList<>();
        //new ArrayList<>();- аналог bookingList, лежит массив
        //new LinkedList<>() - лежит Node
        list1.add(new Person("person 1"));
        list1.add(new Person("person 2"));
        list1.add(new Person("person 1"));
        System.out.println(list1);*/


        PersonLinkedList list=new PersonLinkedList();
  /*      list.add(new Person("Person 1"));
        list.add(new Person("Person 2"));
        list.add(new Person("Person 3"));
       // list.add(new Person("Person 4"));
       // list.add(new Person("Person 5"));
       // list.add(new Person("Person 6"));
        //list.add(new Person("Person 7"));
        System.out.println(list);
        list.remove();
        list.remove();
        list.remove();
        System.out.println(list);*/
        list.add(new Person("Person 1"));
        list.add(new Person("Person 2"));
        list.add(new Person("Person 3"));
        list.add(new Person("Person 4"));
        list.add(new Person("Person 5"));
        list.add(new Person("Person 6"));
        list.add(new Person("Person 7"));

        System.out.println(list);

        Person p=new Person("Person 4");

        System.out.println(list.find(p));

        System.out.println("--------------");
        list.remove(2);
        System.out.println(list);
    }
}
