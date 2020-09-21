package com.company;

public class Person extends TypeOfOwner {
   // private String firstName;
   // private String surname;

    public Person(String owner) {
        super(owner);
    }

  /*  public Person(String owner, String firstName, String secondName) {
        super(owner);
        this.firstName = firstName;
        this.surname = secondName;
    }

    public Person(String owner, String surname) {
        super(owner);
        this.firstName = "";
        this.surname =surname;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person " + getFirstName()+ getSurname();
    }*/



    public String toSortedString(){
        return " is a person '" + getRightlyTheOwner();
    }

    private String getRightlyTheOwner(){
        if(this.getOwner().startsWith(":")){
            return getOwner();}
        return "Company or community";
    }

}
