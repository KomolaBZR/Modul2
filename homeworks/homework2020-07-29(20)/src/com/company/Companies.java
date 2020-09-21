package com.company;

public class Companies extends CommonInformation {
    public Companies (String name, String iban) {
            super(name, iban);
        }
    public String toString() {
        return "CommonInformation{" +
                "name='" + getName() + '\'' +
                ", number='" + getIban() + '\'' +
                '}';
    }

}
