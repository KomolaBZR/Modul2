package com.company;

import java.util.*;

public class MapTask4MapWordsCounter {

    //Task 4 (Map)
    //Дан список имен, где некоторые имена повторяются.
    // Написать функцию, которая по имени вернет количество
    // вхождений этого имени в список.

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Anna", "Katja", "Pasha", "Jack", "Jack", "Anna","Pasha"));
        System.out.println(mapWordsCounter(list));
        List<String> list1= new ArrayList<>();
        System.out.println(mapWordsCounter(list1));

    }

    public static Map<String, Integer> mapWordsCounter(List<String> list) {
        if(list!=null){
        int counter = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
            if(!list.isEmpty()) {
                for (String str : list) {
                    if (map.containsKey(str)) {
                        counter = map.get(str);
                        map.put(str, counter + 1);
                    } else {
                        map.put(str, 1);
                    }
                }
            }
        return map;
        }
        return null;
    }
}
