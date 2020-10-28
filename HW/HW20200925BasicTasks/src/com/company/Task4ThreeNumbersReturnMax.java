package com.company;

public class Task4ThreeNumbersReturnMax {

    //Даны три целых числы a b c, вернуть наибольшее.
    //intMax(1, 2, 3) → 3
    //intMax(1, 3, 2) → 3
    //intMax(3, 2, 1) → 3
    //public int intMax(int a, int b, int c) { }

   /* public static void main(String[] args) {
        System.out.println(intMax(1,2,3));
        System.out.println(intMax(1,3,2));
        System.out.println(intMax(3,2,1));
    }*/

    public static int intMax(int a, int b, int c){
        int max=a;
        if(max<=b&&b>=c){
            max=b;
        }else if(max<c&&c>b){
           max=c;
        }else { return max;}
        return max;
    }
}
