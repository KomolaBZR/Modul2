package com.company;

import java.util.*;

public class Main {

   public static void main(String[] args) {

        Set set = Collections.synchronizedSet(new HashSet());
        set.add("qwe");
        set.add("wert");
        set.add("qwe");
        set.add("ytr");
        set.add("wrtu");
        set.add("qwe");
        set.add("uiop");
        set.add("wrtu");

        System.out.println(set);



        List<String> listOfString = new ArrayList<>();

        listOfString.add("Olga");
        listOfString.add("Vadim");
        listOfString.add("Olga");
        listOfString.add("Sergey");
        listOfString.add("Vasya");
        listOfString.add("Petya");
        listOfString.add("Vasya");

        List<String> newList =new ArrayList<>(new HashSet<>(listOfString));

        System.out.println(getUniqueString(listOfString).toString());

        List<Person> personList=Arrays.asList(
                new Person("Vasya"),
                new Person("Masha"),
                new Person("Vasya"),
                new Person("Kolya"),
                new Person("Kostya"),
                new Person("Kostya"),
                new Person("Valya"),
                new Person("Kostya")
        );
       System.out.println(getUniquePerson(personList).toString());



    }
    public static List<String> getUniqueString(List<String> list){
       if(list ==null) return new ArrayList<String>();
       List<String> newList=new ArrayList<>(new HashSet<String>(list));
       return newList;
    }
    public static List<Person> getUniquePerson(List<Person> list){
        if(list ==null) return new ArrayList<Person>();
        List<Person> newList=new ArrayList<>(new HashSet<Person>(list));
        return newList;
    }
}
/*


qwe         qwe
wert        wert
qwe         ytr
ytr         wrtu
wrtu        uiop
qwe
uiop
wrtu

 */