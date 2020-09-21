package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        //System.out.println(0%2==0);//true


    }


    public static List<String> listHandler(List<String> list,
                                           Predicate<String> predicate,
                                           UnaryOperator<String> operator){
        List<String> resList=new ArrayList<>();
        for(String s: list){
            if(predicate.test(s)){
                resList.add(operator.apply(s));
            }
        }
        return resList;




    }
}


/*
Лист из слов,
у имеющих четную длину - оставить только четные буквы,
у имеющих нечетную - нечетные
 */