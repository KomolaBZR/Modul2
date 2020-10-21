package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("ab","abc","abcd","efghk","c", "cb");

        Stream<String> stream = strings.stream().filter(s -> s.length()>2); //steam можно отработать только один раз
        List<String> list =stream.map(s->s.substring(0,2)).collect(Collectors.toList());
        System.out.println(list);
        Set<String> collect =strings.stream().filter(s -> s.length()>2)
                .map(s->s.substring(1,2)).collect(Collectors.toSet());
        System.out.println(collect);

       // List<String> list =stream.collect(Collectors.toList());
       // System.out.println(list);
        //Set<String> collect1=list.stream().collect(Collectors.toSet());
       // System.out.println(collect1);

        Stream<String> stream1 = strings.stream().filter(s -> s.length()>2);
        Set<String> set=stream1.collect(Collectors.toSet());
        System.out.println(set);

        //  List<String> collect=strings.stream().filter(s->s.length()>2).collect(Collectors.toList());

        // Map<Integer, List<String>> collect1=strings.stream().collect(Collectors.groupingBy(String::length));

       // collect1.forEach((k,v)->System.out.println(k+" = "+v));

        //IntStream intStream=strings.stream().mapToInt(Main::getStringLength);
        //int sum =intStream.sum();
        //strings.stream().mapToInt(Main::getStringLength).forEach(System.out::println);

       /* List<Integer> ints=Arrays.asList(1,2,3,4,5);
        Integer reduce = ints.stream().reduce(1,(x,y)->{
            System.out.println("x = "+x +" y = "+y);
                return x*y;});
        System.out.println(reduce);*/


    }

    private static Integer getStringLength(String input) {
        System.out.println("string = "+input);
        return input.length();
    }
}
