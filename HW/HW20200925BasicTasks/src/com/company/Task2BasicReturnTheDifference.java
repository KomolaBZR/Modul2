package com.company;

public class Task2BasicReturnTheDifference {


    public static int diff21(int n){

        //Дано целое число n, вернуть абсолютную разницу между n и 21,
        // но вернуть удвоенную разницу, если n больше 21.
        // Например:
        //diff21(19) → 2
        // diff21(10) → 11
        // diff21(21) → 0
        // diff21(25) → 8
        //Написать код функции:
        //public int diff21(int n) { }

        int res=0;
        int diff21=21;
            if (n <= diff21) {
                res = diff21 - n;
            } else {
                res = (n - diff21) * 2;
            }
        return res;
    }

}
