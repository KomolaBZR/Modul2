package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7ReturnNumberOfEvenNumbersInArrayTest {
    @Test
    public void testReturnNumberOfEvenNumbersInArray_OddAndEvenNumbersInArray(){
        int[] nums={2,1,2,3,4};
        int expected = 3;
        assertEquals(expected,Task7ReturnNumberOfEvenNumbersInArray.countEvens(nums));
    }
    @Test
    public void testReturnNumberOfEvenNumbersInArray_OnlyEvenNumbersInArray(){
        int[] nums={2,2,0};
        int expected = 3;
        assertEquals(expected,Task7ReturnNumberOfEvenNumbersInArray.countEvens(nums));
    }

    @Test
    public void testReturnNumberOfEvenNumbersInArray_OnlyOddNumbersInArray(){
        int[] nums={1,3,5};
        int expected = 0;
        assertEquals(expected,Task7ReturnNumberOfEvenNumbersInArray.countEvens(nums));
    }


    @Test
    public void testReturnNumberOfEvenNumbersInArray_Null(){
        int[] nums=null;
        int expected = 0;
        assertEquals(expected,Task7ReturnNumberOfEvenNumbersInArray.countEvens(nums));
    }


}