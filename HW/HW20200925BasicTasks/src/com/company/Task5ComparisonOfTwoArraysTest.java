package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5ComparisonOfTwoArraysTest {
    @Test
    public void testComparisonOfTwoArrays_LastElementsAreEqual_True(){

        boolean expected= Task5ComparisonOfTwoArrays.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3});
        assertTrue(expected);
    }

    @Test
    public void testComparisonOfTwoArrays_FirstElementsAreEqual_True(){

        boolean expected= Task5ComparisonOfTwoArrays.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3});
        assertTrue(expected);
    }

    @Test
    public void testComparisonOfTwoArrays_LastAndSecondElementsAreNotEqual_False(){

        boolean expected= Task5ComparisonOfTwoArrays.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3,2});
        assertFalse(expected);
    }

}