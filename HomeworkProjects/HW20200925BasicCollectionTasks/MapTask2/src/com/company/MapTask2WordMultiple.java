package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTask2WordMultiple {

    // Task 2 (Map)
    //Дан массив букв, вернуть мапу Map<String, Boolean>
    // где каждая строка является ключем, а значением true,
    // если строка в массиве больше одного раза и false, если только один раз.
    //Примеры:
    //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    //wordMultiple(["c", "c", "c", "c"]) → {"c": true}

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "a", "c", "b"};
        String[] array2 = {"a", "c", "b"};
        String[] array3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(array1));
        System.out.println(wordMultiple(array2));
        System.out.println(wordMultiple(array3));
    }
    public static Map<String, Boolean> wordMultiple(String[] array) {
        if (array != null) {
            Map<String, Boolean> sortedResult = new HashMap<>();
            if (array.length > 0) {
                Set<String> set = new HashSet<>();
                for (String s : array) {
                    if (set.add(s)) {
                        sortedResult.put(s, false);
                    } else {
                        sortedResult.put(s, true);
                    }
                }
            }
            return sortedResult;
        }else return null;
    }
}
