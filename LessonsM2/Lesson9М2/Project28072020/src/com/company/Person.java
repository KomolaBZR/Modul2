package com.company;

public class Person {
    private String name;
    private String surname;
    private String fathername;

    public Person(String name, String surname, String fathername) {
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathername='" + fathername + '\'' +
                '}';
    }
}
