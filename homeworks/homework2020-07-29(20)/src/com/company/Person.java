package com.company;

public class Person extends CommonInformation {
    public Person (String name, String iban) {
        super(name, iban);
    }

    public String toString() {
        return "CommonInformation{" +
                "name='" + getName() + '\'' +
                ", number='" + getIban() + '\'' +
                '}';
    }


}
