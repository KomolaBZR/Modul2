package com.company;

import java.util.Arrays;

public class Task8ZeroMax {
    //Вернуть версию входного массива,
    // где каждыое нулевое значение заменено максимальным нечетным значением,
    // справа от нуля. Если нечетных числе справа от нуля нет, то оставляем ноль.
    //zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    // zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    // zeroMax([0, 1, 0]) → [1, 1, 0]
    //public int[] zeroMax(int[] nums) {}


        public static int[] zeroMax(int[] nums) {
            if(nums!=null) {
                int i = nums.length - 1;
                while (i >= 0 && nums[i] % 2 == 0)
                    i--;
                    for (int j = i - 1; j >= 0; j--) {
                        if (nums[j] == 0)
                            nums[j] = nums[i];
                        if (nums[j] % 2 == 1 && nums[j] > nums[i])
                            i = j;
                    }
                    return nums;
            }else {return null;}
        }






}
