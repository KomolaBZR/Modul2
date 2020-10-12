package com.company;

public class Task9ShiftingArrayElementsToTheLeft {
    //Вернуть массив, смещенный влево на один индекс.
    // То ест для {6, 2, 5, 3} вернуть {2, 5, 3, 6}.
    // Можно вернуть измененный данный массив, а можно вернуть новый.
    //shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    // shiftLeft([1, 2]) → [2, 1]
    // shiftLeft([1]) → [1]
    //public int[] shiftLeft(int[] nums) { }

    public static int[] shiftLeft(int[] nums) {
        if(nums!=null) {
            int lastIndex = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = lastIndex;
            return nums;
        }else return null;
    }

}
