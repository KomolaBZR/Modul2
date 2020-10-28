package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapTask1GetMapAB {
    //Task 1 (Map)
    //Дана Map<String, String> map, написать функцию, которая вернет Мап,
    // такую, если в есходной map есть ключ ‘a’ и ‘b’,
    // то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.
    //Примеры:
    //mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    //mapAB({"a": "Hi"}) → {"a": "Hi"}
    //mapAB({"b": "There"}) → {"b": "There"}

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        System.out.println(getMapAB(map,"a","b"));
    }

    public static Map<String,String> getMapAB(Map<String, String> map, String key1, String key2){
        if (map != null && !map.isEmpty()) {
            if (map.containsKey(key1) && map.containsKey(key2)) {
                map.put(key1 + key2, map.get("a") + map.get("b"));
            }
        }
        return map;
    }
}
