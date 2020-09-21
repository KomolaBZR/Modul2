package com.company;

public class BookingsArraysManager {
    public static Booking bookingNewOrder(Room room, Person person, DateInterval dateInterval) {
        return new Booking(room, person, dateInterval);
    }

    public static Booking[] collectorOfBookingsOrders(Booking[] bookings){
        return bookings;
    }

    public static void printOrders(Booking[] bookings){
        for (Booking booking: bookings) {
            System.out.println(booking.toString());
        }
    }



}
