package com.company;

public class SuiteBook extends Room {
    private final double priceCoefficient=1.3;


    public SuiteBook(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public String toString() {
        return "SuiteRoom №" + getNumber() +" (" +getPrice()+')';
    }

}
