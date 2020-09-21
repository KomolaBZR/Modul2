package com.company;

public class Visa extends Card {
    public Visa (Person person, String number) {
        super(person,number);
    }

    @Override
    public String toString() {
        return "Visa{" +
                "person=" + getPerson() +
                ", number='" + getNumber() + '\'' +
                '}';
    }

    public String toSecureString(){
        return "Visa{" +
                "person=" + getPerson() +
                ", number='" + getSecureNumber() + '\'' +
                '}';
    }
    private String getSecureNumber(){
        String star ="";
        for(int i=0; i<getNumber().length()-6;i++){
            star+="*";
        }
        return getNumber().substring(0,3)+star+getNumber().substring(getNumber().length()-2);
    }
}
