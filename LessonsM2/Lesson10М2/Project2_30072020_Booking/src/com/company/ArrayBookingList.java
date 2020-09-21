package com.company;

public class ArrayBookingList implements BookingList {
    private Booking[] bookings;
    private  int size=0;
    private int capacity=3;

    public ArrayBookingList(int capacity) {
        this.capacity = capacity;
        bookings=new Booking[this.capacity];
    }

    public void add(Booking booking) {

        if(size<capacity){
            bookings[size++]=booking;
        }else {
            capacity=capacity*2;
            Booking[] temp=new Booking[capacity];
            for(int i=0; i<bookings.length;i++){
                temp[i]=bookings[i];
            }
            bookings=temp;
            bookings[size++]=booking;

        }
    }

    public int size() {
        return size;
    }

    public void print() {
     for(int i=0; i<size;i++){
         System.out.println(bookings[i]);
     }
    }
}
