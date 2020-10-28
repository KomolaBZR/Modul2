package com.company;

import java.util.function.Function;
import java.util.function.Predicate;

public class WordsTransformer {

    //"abc defG ikl" -> "ABC defG IKL"
    // length == 3 -> toUpperCase
    // length == 5 -> toLowerCase
    // length is even -> to UpperCase
    // etc
    //public static String transform(String sentence) {return null;}
    //
    //
    // Implement using functional interfaces in Java
    //1.Choose functional interfaces and extend method signature
    //2.Adjust logic ni the method to use these functional interfaces
    //3.Don't forget about unit tests



    public static void main(String[] args) {
        System.out.println(transformEquals3("abc defG ikl"));
        System.out.println(transformEquals5("ABCDE defG iklJC"));
        System.out.println(transformEven("abcd ghkjz eftz"));

    }

    public static String transform(String sentence, Predicate<String> p, Function<String,String> f) {
        String[] temp=sentence.split(" ");
        String result="";

        for (int i=0; i<temp.length;i++){
            if(p.test(temp[i])){
                temp[i]=f.apply(temp[i]);
            }
            //result =result.concat(" ").concat(temp[i]);
        }
        //return result;
        return String.join(" ",temp);
    }

    public static String transformEquals3(String s){
        return transform (s, str->str.length()==3, str->str.toUpperCase());
    }
    public static String transformEquals5(String s){
        return transform (s, str->str.length()==5, str->str.toLowerCase());
    }
    public static String transformEven(String s){
        return transform (s, str->str.length()%2==0, str->str.toUpperCase());
    }
}
