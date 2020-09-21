package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        //List<String> list=new LinkedList<>();
        ArrayList<String> arrayList=(ArrayList<String>)list;
        arrayList.trimToSize();
        //ArrayList<String> arrayList=(ArrayList)list;
        //arrayList.
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add(0,"str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");


        System.out.println(list);
        if(list.size()>7){
            System.out.println(list.get(7));
        }

        System.out.println("------------------FOR------------------");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("---------------FOR-EACH----------------");
        for(String s: list){
            System.out.print(s+" ");
        }

        System.out.println();
       /* System.out.println("---------------------------------------");
        list.remove(0);
        System.out.println(list);*/


        System.out.println("---------------------------------------");
        list.sort(new StringComparator());
        System.out.println(list);


        System.out.println("---------------------------------------");



    }
}
