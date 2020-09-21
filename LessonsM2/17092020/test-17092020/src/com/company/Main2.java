package com.company;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("First");
        treeSet.add("Second");
        treeSet.add("Third");
        Iterator<String> itr = treeSet.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        

    }
}
