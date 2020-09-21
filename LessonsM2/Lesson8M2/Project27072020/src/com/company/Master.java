package com.company;

public class Master extends Card {
    public Master (Person person, String number) {
        super(person,number);
    }

    public String toString() {
        return "Master{" +
                "person=" + getPerson() +
                ", number='" + getNumber() + '\'' +
                '}';
    }

    public String toSecureString(){
        return "Master{" +
                "person=" + getPerson() +
                ", number='" + getSecureNumber() + '\'' +
                '}';
    }

    private String getSecureNumber(){
        String star ="";
        for(int i=0; i<getNumber().length()-6;i++){
            star+="*";
        }
        return getNumber().substring(0,2)+star+getNumber().substring(getNumber().length()-2);
    }
}
