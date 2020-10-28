package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTask6CombiningTwoListsIntoOne {
    //Task 6 (List)
    //Объединить два списка в один

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        System.out.println(combineTwoListsIntoOne(list1, list2));
    }
    public static List<Integer> combineTwoListsIntoOne(List<Integer> list1, List<Integer> list2) {
       if(list1!=null&&list2!=null) {
           List<Integer> combinedList = new ArrayList<>();
           combinedList.addAll(list1);
           combinedList.addAll(list2);
           return combinedList;
       }else {return null; }
    }
}
