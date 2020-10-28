package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTask7ReturnListWithoutElementsGreaterThanX {

    //Task 7 (List)
    //Есть список с целыми числами. Написать функцию, которая вернет список без
    //элементов, больше заданного.

    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(getNewListWithoutElementsGreaterThanX(list, 4));
    }

    public static List<Integer> getNewListWithoutElementsGreaterThanX(List<Integer> list, int x) {
        if (list != null) {
            List<Integer> sortedList = new ArrayList<>();
            for (Integer integer : list) {
                if (integer < x) {
                    sortedList.add(integer);
                }
            }
            return sortedList;
        }else {return null;}
    }
}
