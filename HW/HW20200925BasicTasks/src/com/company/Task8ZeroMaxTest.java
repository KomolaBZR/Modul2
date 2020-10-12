package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task8ZeroMaxTest {




    @Test
    public void testZeroMax_ReplacingZeroWithMaxOddNumberToTheRigthSideOfZero(){
        int[] nums1={0, 5, 0, 3};
        int[] expected1 = {5, 5, 3, 3};

        int[] nums2={0, 4, 0, 3};
        int[] expected2 = {3, 4, 3, 3};

        assertEquals(Arrays.toString(expected1),Arrays.toString(Task8ZeroMax.zeroMax(nums1)));
        assertEquals(Arrays.toString(expected2),Arrays.toString(Task8ZeroMax.zeroMax(nums2)));
    }


    @Test
    public void testZeroMax_NoReplacingZero(){
        int[] nums1={0, 1, 0};
        int[] expected1 = {1, 1, 0};

        int[] nums2={0,1,0,0,0};
        int[] expected2 = {1,1,0,0,0};

        assertEquals(Arrays.toString(expected1),Arrays.toString(Task8ZeroMax.zeroMax(nums1)));
        assertEquals(Arrays.toString(expected2),Arrays.toString(Task8ZeroMax.zeroMax(nums2)));
    }
    @Test
    public void testZeroMax_NoZeroNumbersinArray(){
        int[] nums={2, 1, 3};
        int[] expected = {2, 1, 3};

        assertEquals(Arrays.toString(expected),Arrays.toString(Task8ZeroMax.zeroMax(nums)));

    }


    @Test
    public void testZeroMax_Null(){
        int[] nums=null;
        assertNull(Task8ZeroMax.zeroMax(nums));
    }

}