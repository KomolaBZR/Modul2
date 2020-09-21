package com.company;

public class Booking {
    static private int nextId=0;
    private int id;
    private Room room;
    private Person person;
    private DateInterval dateInterval;

    public Booking(Room room, Person person, DateInterval dateInterval) {
        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;
        this.id=++nextId;
    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

    public DateInterval getDateInterval() {
        return dateInterval;
    }

    public double getPrice(){
        return this.room.getPrice()*this.dateInterval.getDays();
    }

    @Override
    public String toString() {
        return "( "+id+" )"+" Booking: " +room +
                " person=" + person +
                " " + dateInterval +
                " \n\tprice for "+ this.dateInterval.getDays()+ " days is " +
                getPrice()+ " Euro";
    }
}
