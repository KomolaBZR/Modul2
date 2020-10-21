package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListTask5ReverseList {
    //Task 5 (List)
    // Написать функцию, которая реверсирует список,
    // возвращает список элементов в обратном порядке.
    // {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        System.out.println(list+" -> "+getReverseList(list));

    }
    public static List<Integer> getReverseList(List<Integer> list){
        if(list!=null){
            Collections.reverse(list);
            return list;
        }else {
            return null;
        }
    }
}
