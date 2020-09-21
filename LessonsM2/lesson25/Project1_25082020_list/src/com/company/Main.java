package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("str1");
        list.add("qstr2");
        list.add("qstr3");
        list.add("str4");
        list.add("str5");
        list.add("qstr6");
        list.add("str6");
        System.out.println(list);
        /*for(int i=0; i<list.size();i++){
            if(list.get(i).startsWith("q")){
                list.remove(i);
                i--;
            }
        }*/
   /*     for(String s: list){
            if(s.startsWith("q")){
                list.remove(s);
            }
        }*/

/*        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("q")){
                iterator.remove();
            }
        }
*/
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("q")){
                iterator.remove();
            }
        }


        //Predicate<String> predicate=new ConditionForRemove();
       list.removeIf(new ConditionForRemove());

        //list.removeIf(s->s.startsWith("q"));//Лямбда-выражение

        System.out.println("-----------remove--------------");
        System.out.println(list);

       /* add(Booking booking){
            list.add(booking);
        }*/
        System.out.println("---------------------------");
        String[] array= list.toArray(new String[list.size()]);

        List<String> list1= Arrays.asList("s1","s2","s3");
        System.out.println(list1);

        //List<Integer>
                Integer h=10;
        Integer h1=new Integer(10);

        System.out.println("---------------------------");
        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(10);
        list2.add(18);
        System.out.println(list2);

        System.out.println("----------------------------");
        list2.addAll(Arrays.asList(1,2,3,4));
        System.out.println(list2);



        List<Integer> list3=new ArrayList<>();
        list2.add(121);
        list2.add(101);
        list2.add(181);
        list2.addAll(list3);
        System.out.println(list2);



        LinkedList<String> list4= new LinkedList<String>();
        list4.








    }
}
