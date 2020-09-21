package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        Map<String,String> map=new HashMap<>();
        map.entrySet();
        System.out.println(map.entrySet());

        set.add("1");
        set.add("4");
        set.add("3");
        set.add("2");
        System.out.println(set);

        map.put("1","q");
        map.put("4","qwer");
        map.put("3", "qwe");
        map.put("2", "qwert");
        map.put("2","po");
        System.out.println(map);
        System.out.println(map.keySet());
    }
}
