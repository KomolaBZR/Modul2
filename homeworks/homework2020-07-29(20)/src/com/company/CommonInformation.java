package com.company;

public abstract class CommonInformation {
    private String name;
    private String iban;

    public CommonInformation(String name, String number) {
        this.name = name;
        this.iban = number;
    }

    public String getName() {
        return name;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return "CommonInformation{" +
                "name='" + name + '\'' +
                ", number='" + iban + '\'' +
                '}';
    }
   // public abstract String toSecureString();
}
