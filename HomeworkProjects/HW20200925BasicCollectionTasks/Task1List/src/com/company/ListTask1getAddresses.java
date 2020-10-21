package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTask1getAddresses {

    //Task 1 (List)
    // Есть два класса: Address с полями улица и номер дома и Person с полями имя и Address.
    //Нужно написать функцию: List<Address> getAddresses(List<Person> persons)

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Ivan", new Address("Friedrich str.", "7A")),
                new Person("Maria", new Address("Mueller str.", "5")),
                new Person("Stephan", new Address("Luxemburg str.", "8")),
                new Person("John", new Address("Karl-Marx-Straße", "10")),
                new Person("Amalia", new Address("Seestraße", "5")));

        System.out.println("---------Actual List with Names and Addresses---------");
        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println("-------------------Get Addresses----------------------");
        System.out.println(getAddresses(persons));



    }

    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> list = new ArrayList<>();
        if (persons != null) {
            for (Person p: persons) {
                list.add(p.getAddress());
            }
            return list;
        } else {
            return null;
        }
    }
}