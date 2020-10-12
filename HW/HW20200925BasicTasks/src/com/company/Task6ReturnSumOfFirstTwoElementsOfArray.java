package com.company;

public class Task6ReturnSumOfFirstTwoElementsOfArray {
    //Дан массив целых чисел.
    // Вернуть сумму двух первых элементов массива.
    // Если длина массива меньше двух, вернуть сумму всех элементов.
    // Вернуть 0, если длина массива равна нулю.
    //sum2([1, 2, 3]) → 3
    // sum2([1, 1]) → 2
    // sum2([1, 1, 1, 1]) → 2
    //public int sum2(int[] nums) { }

    public static int sum2(int[] nums) {
        if(nums!=null){
            if(nums.length>=2){
                return (nums[0] + nums[1]);
            }else if (nums.length == 1) {return nums[0];
            } else { return 0;
            }
        }else return 0;

    }

}
