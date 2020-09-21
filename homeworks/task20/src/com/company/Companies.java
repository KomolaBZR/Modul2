package com.company;

public class Companies extends TypeOfOwner {

    public Companies(String owner) {
        super(owner);
    }

    public String toString() {
        return "company or community ='" + getOwner() ;
    }
    public String toSortedString(){
        return "is company or community='" + getRightlyTheOwner() ;
    }
    private String getRightlyTheOwner(){
        if(this.getOwner().startsWith(":")){
            return "is person";}
        return getOwner();
    }
}
