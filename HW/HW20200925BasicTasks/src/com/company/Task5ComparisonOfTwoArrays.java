package com.company;

public class Task5ComparisonOfTwoArrays {
    //Даны два массива целых чисел.
    // Вернуть true если у них одинаковый первый или последний элемент.
    // Оба массива длины 1 или более.
    //commonEnd([1, 2, 3], [7, 3]) → true
    //commonEnd([1, 2, 3], [7, 3, 2]) → false
    //commonEnd([1, 2, 3], [1, 3]) → true
    //public boolean commonEnd(int[] a, int[] b) { }

    public static boolean commonEnd(int[] a, int[] b){
        if((a[0]==b[0]) ||(a[a.length-1]==b[b.length-1])){
            return true;
        }else return false;
    }
}
