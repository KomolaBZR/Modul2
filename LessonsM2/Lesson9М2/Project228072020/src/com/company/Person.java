package com.company;

public class Person {
    private String surname;
    private String firstName;
    private String secondName; //fatherName

    public Person(String surname, String firstName, String secondName) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public Person(String surname, String firstName) {
        this(surname, firstName,"");
    }
    public Person(String surname) {
        this(surname,"","");
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public String toShortString() {

        return surname
                + ((firstName.length()>0)?" "+firstName.substring(0,1)+".":firstName)
                + ((secondName.length()>0)?" "+secondName.substring(0,1)+".":secondName);
    }
}
