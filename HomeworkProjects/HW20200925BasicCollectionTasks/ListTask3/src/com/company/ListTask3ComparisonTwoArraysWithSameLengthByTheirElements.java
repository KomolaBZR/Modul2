package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTask3ComparisonTwoArraysWithSameLengthByTheirElements {

    //Task 3 (List)
    // Есть два списка одинаковой длины с числами. Написать функцию, которая
    //вернет список с элементами Yes или No,
    // где значение на i-том месте зависит от того, равны ли элементы
    // двух списков под номером i.
    // Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {No, Yes, Yes, No}

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,2,3,8);

        System.out.println(resultOfComparison(list1,list2));


    }

    public static List<String> resultOfComparison(List<Integer> list1, List<Integer> list2) {
        if ((list1 != null) && (list2 != null)) {
            List<String> result = new ArrayList<>();
            for (Integer int1 : list1) {
                if (list2.contains(int1)) {
                    result.add("Yes");
                } else {
                    result.add("No");
                }
            }
            return result;
        } else { return null;}
    }
}
