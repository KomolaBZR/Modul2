package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Person,String> map;
        map=new HashMap<>();

        Person p1=new Person("Igor",20);
        Person p2=new Person("Lena",18);
        Person p3=new Person("Nick",25);



        map.put(p1,p1.getName());
        map.put(p2,p1.getName());
        map.put(p3,p1.getName());
             System.out.println("p1 hashCode "+p1.hashCode());
             System.out.println("p2 hashCode "+p2.hashCode());
             System.out.println("p3 hashCode "+p3.hashCode());
        System.out.println(map);

        System.out.println(map.get(p1));
        map.remove(p1);
        p1.setAge(21);
        map.put(p1,p1.getName());


        System.out.println(map);
        System.out.println("2.------"+map.get(p1));

        System.out.println("p1 hashCode "+p1.hashCode());


        for(Map.Entry<Person,String> iEntry: map.entrySet()){
            System.out.println(iEntry.getKey()+" "+iEntry.getValue());
        }

        final Set<Person> people=map.keySet();
        for(Person person: people){
            System.out.println(person +" "+map.get(person));
        }

        System.out.println("-----------------");
        //map.forEach((p,s)-> System.out.println(p+" "+s));

        map.forEach((key,value)-> System.out.println(key+" "+value));


    }
}
