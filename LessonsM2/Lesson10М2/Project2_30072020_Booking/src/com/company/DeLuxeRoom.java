package com.company;

public class DeLuxeRoom extends Room{
    private final double priceCoefficient=1.3;
    private final double deLuxeTax=50.0;

    public DeLuxeRoom(String number, int capacity) {
        super(number, capacity);
    }
    public double getPrice() {
        return getBasePrice()*priceCoefficient+deLuxeTax;
    }

    @Override
    public String toString() {
        return "DeLuxe Room №" +getNumber()+" ("+getPrice() + ')';
    }

}
