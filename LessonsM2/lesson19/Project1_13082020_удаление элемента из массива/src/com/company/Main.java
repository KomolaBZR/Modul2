package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
//[1][2][null][3][4]
//[1][2][3][4][5] ->[1][2][4][5][] (size)

public class Main {

    public static void main(String[] args) {
        String[] array = {"a","b","c","d","e"};
        ArrayHandler arrayHandler= new ArrayHandler(array);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
        System.out.println("------------------------");
        arrayHandler.remove3(4);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
        System.out.println("------------------------");

    }


}
