package com.company;

public class Task implements Comparable<Task>{
    private int id;
    private Status status;
    private String description;
    private Priority priority;



    public Task(int id, Status status, String description) {
       this(id,status,description,Priority.LOW);


       // this.id = id;
       // this.status = status;
       // this.description = description;
       // this.priority=Priority.LOW;
    }

    public Task(int id, Status status, String description, Priority priority) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Task o) {
        return 0;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", status: " + status +
                " " + description + '\'' +
                " " + priority;
    }
}
