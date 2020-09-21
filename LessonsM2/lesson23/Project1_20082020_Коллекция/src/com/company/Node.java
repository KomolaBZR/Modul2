package com.company;

public class Node {

    private Node next;
    private Node prev;
    Person person;

    public Node(Person person) {
        this.person = person;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Node getPrev() {
        return prev;
    }

    public Person getPerson() {
        return person;
    }
}
