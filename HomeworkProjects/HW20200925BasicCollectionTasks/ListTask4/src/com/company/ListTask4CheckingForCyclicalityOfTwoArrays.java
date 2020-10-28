package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTask4CheckingForCyclicalityOfTwoArrays {

    //Task 4 (List)
    // Есть два списка с буквами. Определить, является ли один список циклической версией другого.
    // Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb} результат будет true,
    // а для {dd, ee, ff} и {dd, ff, ee} - false.

    public static void main(String[] args) {

        List<String> list1= Arrays.asList("aa", "bb", "cc", "dd");
        List<String> list2=Arrays.asList("cc", "dd", "aa", "bb");
        System.out.println(checkIfThereIsCyclicityBetweenTwoArrays(list1,list2));

        List<String> list1a= Arrays.asList("dd", "ee", "ff");
        List<String> list2a=Arrays.asList("dd", "ff", "ee");
        System.out.println(checkIfThereIsCyclicityBetweenTwoArrays(list1a,list2a));

    }

    public static boolean checkIfThereIsCyclicityBetweenTwoArrays(List<String> list1, List<String> list2) {
        if (list1 != null && list2 != null) {
            if (list1.size() == list2.size()) {
                for (int i = list1.size(); i >= 0; i--) {
                    Collections.rotate(list1, 1);
                    if (list1.equals(list2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
