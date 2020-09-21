package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        //список строк ->  получить Мар, в котором будут пары соответствия имя + количество раз, которое встречается в списке

        List<String> listOfString = new ArrayList<>();

        listOfString.add("Olga");
        listOfString.add("Vadim");
        listOfString.add("Olga");
        listOfString.add("Sergey");
        listOfString.add("Vasya");
        listOfString.add("Petya");
        listOfString.add("Vasya");
        listOfString.add("Vasya");

        System.out.println(getMapOfStrings(listOfString).toString());
    }

    public static Map<String, Integer> getMapOfStrings(List<String> list){
        Map<String, Integer> result= new HashMap<>();
        if(list == null) return result;

        for(String string: list){
            if(result.containsKey(string)){
             /* Integer i=  result.get(string);//value от string из Map
              i++;
              result.put(string,i);*/

                result.put(string,result.get(string)+1);

            }
            else{
                result.put(string,1);
            }
        }




        return result;
    }
}
