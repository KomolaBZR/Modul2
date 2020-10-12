package com.company;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Anagram {
    //public static List<String> VOC= Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi", "navi","annna");

    private Map<String,List<String>> map;


    public Anagram(List<String> voc){
        map = buildMap(voc);
    }

 /*   public static void main(String[] args) {
    }*/

    public List<String> getAnagram (String word){
      /*  List<String> res=new ArrayList<>();
        for(String w: VOC){
            if(sortWord(w).equals(sortWord(word))){
                res.add(w);
            }
        }*/

        String sortedWord =sortWord(word);
        return map.get(sortedWord);
    }
    //“aann” -> "anna", "naan"
    //"ainv" ->"ivan", "vani", "navi"
    private Map<String, List<String>> buildMap(List<String> voc){
        Map<String, List<String>> ret=new HashMap<>();
        for(String w:voc){
            String sortedWord =sortWord(w);
            List<String> list=ret.get(sortedWord);
            if (ret.get(sortWord(w))==null){
                list =new ArrayList<>();
                list.add(w);
                ret.put(sortedWord,list);
            }else{
                list.add(w);
            }

        }
        return ret;
    }

    private static String sortWord(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }





}



// {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
//“anna” -> "naan"
//"ivan" -> "vani", "navi"
//"ainv" -> "ainv", "ainv"
//“piotr” -> {}
// “anna” -> "annna" <- incorrect

 /*   Анаграмма слова x - слово, по длине равное x и состоящее из таких же букв,
        что и x. Например, слово “vani” является анаграммой слова “ivan”, а слова
        “naan” и “anan” являются анаграммами слова “anna”. Дан словарь, сожержащий
        анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
        Написать функцию, которая по слову из словаря вернет все анаграммы этого
        слова, которые есть в словаре. Например, по слову “ivan” функция вернет
        {“navi”, “vani”}

  */
