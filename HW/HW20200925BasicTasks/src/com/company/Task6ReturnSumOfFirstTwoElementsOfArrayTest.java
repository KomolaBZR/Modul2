package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6ReturnSumOfFirstTwoElementsOfArrayTest {

    @Test
    public void testReturnSumOfFirstTwoElementsOfArray_MoreThanTwoElementsInArrays(){
        int[] a={1,2,3};
        int[] b={1,1,1,1};
        int expectedA = 3;
        int expectedB = 2;
        assertEquals(expectedA,Task6ReturnSumOfFirstTwoElementsOfArray.sum2(a));
        assertEquals(expectedB,Task6ReturnSumOfFirstTwoElementsOfArray.sum2(b));

    }
    @Test
    public void testReturnSumOfFirstTwoElementsOfArray_OnlyTwoElementsInArrays(){
        int[] a={1,1};
        int expected = 2;
        assertEquals(expected,Task6ReturnSumOfFirstTwoElementsOfArray.sum2(a));

    }

    @Test
    public void testReturnSumOfFirstTwoElementsOfArray_OnlyOneElementInArrays(){
        int[] a={1};
        int expected = 1;
        assertEquals(expected,Task6ReturnSumOfFirstTwoElementsOfArray.sum2(a));

    }
    @Test
    public void testReturnSumOfFirstTwoElementsOfArray_Null(){
        int[] a=null;
        int expected = 0;
        assertEquals(expected,Task6ReturnSumOfFirstTwoElementsOfArray.sum2(a));

    }

}