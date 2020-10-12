package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task9ShiftingArrayElementsToTheLeftTest {
    @Test
    public void testShiftingArrayElementToTheLeft_MoreThanTwoElements(){
        int[] nums1={6, 2, 5, 3};
        int[] expected1 = {2, 5, 3, 6};

        int[] nums2={6, 1, 2, 3, 4, 5};
        int[] expected2 = {1,2,3,4,5,6};

        assertEquals(Arrays.toString(expected1),Arrays.toString(Task9ShiftingArrayElementsToTheLeft.shiftLeft(nums1)));
        assertEquals(Arrays.toString(expected2),Arrays.toString(Task9ShiftingArrayElementsToTheLeft.shiftLeft(nums2)));
    }

    @Test
    public void testShiftingArrayElementToTheLeft_TwoElements(){
        int[] nums={1, 2};
        int[] expected = {2,1};

        assertEquals(Arrays.toString(expected),Arrays.toString(Task9ShiftingArrayElementsToTheLeft.shiftLeft(nums)));

    }

    @Test
    public void testShiftingArrayElementToTheLeft_OnlyElement(){
        int[] nums={1};
        int[] expected = {1};

        assertEquals(Arrays.toString(expected),Arrays.toString(Task9ShiftingArrayElementsToTheLeft.shiftLeft(nums)));

    }

    @Test
    public void testShiftingArrayElementToTheLeft_Null(){
        int[] nums=null;
        assertNull(Task9ShiftingArrayElementsToTheLeft.shiftLeft(nums));
    }




}