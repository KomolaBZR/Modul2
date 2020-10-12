package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4ThreeNumbersReturnMaxTest {
    @Test
    public void testThereAreThreeNumber_ReturnMaxNumber_LastIsMax(){
       int a=1,b=2,c=3;
        int expected = 3;
        assertEquals(expected,Task4ThreeNumbersReturnMax.intMax(a,b,c));

    }
    @Test
    public void testThereAreThreeNumber_ReturnMaxNumber_SecondIsMax(){
        int a=1,b=3,c=2;
        int expected = 3;
        assertEquals(expected,Task4ThreeNumbersReturnMax.intMax(a,b,c));

    }
    @Test
    public void testThereAreThreeNumber_ReturnMaxNumber_FirstIsMax(){
        int a=3,b=2,c=1;
        int expected = 3;
        assertEquals(expected,Task4ThreeNumbersReturnMax.intMax(a,b,c));

    }


}