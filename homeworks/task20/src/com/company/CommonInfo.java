package com.company;

public class CommonInfo {
    private TypeOfOwner owner;
    private String iban;

    public CommonInfo(TypeOfOwner owner, String iban) {
        this.owner = owner;
        this.iban = iban;
    }


    public TypeOfOwner getOwner() {
        return owner;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return "Common Information {" +
                "Owner'" + owner + '\'' +
                ", IBAN ='" + iban + '\'' +
                '}';
    }


}
