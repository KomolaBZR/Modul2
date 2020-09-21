package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Task task1=new Task(1,Status.READY,
                "xxxxxx",Priority.HIGH);
        Task task2=new Task(2,Status.PENDING,
                "zzzzz",Priority.LOW);
        Task task3=new Task(3,Status.NOTACCEPTED,
                "yyyyyy",Priority.HIGH);
        Task task4=new Task(4,Status.READY,
                "yyyyy");
        Task task5=new Task(5,Status.NOTACCEPTED,
                "wwwwwww",Priority.NORMAL);
        List<Task> tasks =new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);

        //TaskHandler.tasksQueue(tasks);
        System.out.println(TaskHandler.tasksQueue(tasks));
    }
}
