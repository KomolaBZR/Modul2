package com.company;

public abstract class TypeOfOwner{
    private String owner;

    public TypeOfOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return  owner;
    }

    public abstract String toSortedString();
}
