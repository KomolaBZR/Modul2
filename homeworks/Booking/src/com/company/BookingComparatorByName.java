package com.company;

import java.util.Comparator;

public class BookingComparatorByName implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getPerson().getName().compareTo(o2.getPerson().getName());

    }

}
