package com.company;

public class Address {
    private String street;
    private String houseNumber;

    public Address(String street, String houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Address: " + street + " " +
                 houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (houseNumber != null ? !houseNumber.equals(address.houseNumber) : address.houseNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + (houseNumber != null ? houseNumber.hashCode() : 0);
        return result;
    }
}
