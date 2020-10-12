package com.company;

public class Task11ReturnMiddleTwoElementsInString {
    //Дана строка четной длины. Вернуть строку из двух центральных символов,
    // например строка "string" превратиться в "ri". Длина входной строки минимум 2.
    //middleTwo("string") → "ri"
    // middleTwo("code") → "od"
    // middleTwo("Practice") → "ct"
    //public String middleTwo(String str) { }


    public static String middleTwo(String str) {
        if(str.length()>2&&str.length()%2==0){
            return str.substring(str.length()/2-1,str.length()/2+1);
        }else return str;
    }
}
