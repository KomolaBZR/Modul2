package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2BasicReturnTheDifferenceTest {
    @Test
    public void testReturnTheDifference_NumberIsSmallerThanOrEqualTo21(){
        int res1=Task2BasicReturnTheDifference.diff21(19);
        int res2=Task2BasicReturnTheDifference.diff21(10);
        int res3=Task2BasicReturnTheDifference.diff21(21);

        int expected1 = 21-19;
        int expected2 = 21-10;
        int expected3 = 21-21;
        assertEquals(expected1,res1);
        assertEquals(expected2,res2);
        assertEquals(expected3,res3);
    }
    @Test
    public void testReturnTheDifference_NumberIsLargerThan21(){
        int res1=Task2BasicReturnTheDifference.diff21(25);
        int res2=Task2BasicReturnTheDifference.diff21(29);

        int expected1= 8;
        int expected2= 16;//(29-21)*2;

        assertEquals(expected1,res1);
        assertEquals(expected2,res2);
    }

}