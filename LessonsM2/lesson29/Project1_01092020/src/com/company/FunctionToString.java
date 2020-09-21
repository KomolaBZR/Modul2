package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionToString implements BiFunction<List<String>,
        Predicate<String>, List<String>> { //implements UnaryOperator<List<String>>
    //private Predicate predicate;

    @Override
    public List<String> apply(List<String> stringsList, Predicate<String> predicate) {
        List<String> res=new ArrayList<>();
        if(stringsList==null) {return res;}
        for (String s: stringsList){
            if(predicate.test(s)){
                res.add(s);
            }
        }
        return res;
    }



    /*@Override
    public List<String> apply(List<String> stringsList) {
        List<String> res=new ArrayList<>();
        if(stringsList==null) {return res;}
        for (String s: stringsList){
            if(predicate.test(s)){
                res.add(s);
            }
        }
        return res;
    }

    public FunctionToString(Predicate predicate) {
        this.predicate = predicate;
    }

     */



}
