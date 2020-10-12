package com.company;

public class Task7ReturnNumberOfEvenNumbersInArray {
    //Вернуть количество четных чисел в массиве целых чисел.
    // Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.
    //countEvens([2, 1, 2, 3, 4]) → 3
    // countEvens([2, 2, 0]) → 3
    // countEvens([1, 3, 5]) → 0
    //public int countEvens(int[] nums) { }

    public static int countEvens(int[] nums) {

        int counterEvenNum=0;
        if(nums!=null){
        for (int i=0; i<nums.length;i++){
            if(nums[i]%2==0){
                counterEvenNum++;
            }
        }
        return counterEvenNum;}else return 0;
    }

}
