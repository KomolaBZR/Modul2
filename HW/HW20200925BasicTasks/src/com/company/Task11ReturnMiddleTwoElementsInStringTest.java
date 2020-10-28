package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11ReturnMiddleTwoElementsInStringTest {
    @Test
    public void testReturnMiddlenTwoElementsInString_StringLengthHasMoreThanTwoCharsAndEvenItems(){
        String s1=Task11ReturnMiddleTwoElementsInString.middleTwo("string");
        String s2=Task11ReturnMiddleTwoElementsInString.middleTwo("code");
        String s3=Task11ReturnMiddleTwoElementsInString.middleTwo("Practice");

        String expected1= "ri";
        String expected2= "od";
        String expected3= "ct";
        assertEquals(expected1,s1);
        assertEquals(expected2,s2);
        assertEquals(expected3,s3);

    }

    @Test
    public void testReturnMiddlenTwoElementsInString_StringLengthHasMoreThanTwoCharsAndODDItems(){
        String s1=Task11ReturnMiddleTwoElementsInString.middleTwo("strings");
        String s2=Task11ReturnMiddleTwoElementsInString.middleTwo("codes");


        String expected1= "strings";
        String expected2= "codes";

        assertEquals(expected1,s1);
        assertEquals(expected2,s2);


    }

    @Test
    public void testReturnMiddlenTwoElementsInString_StringLengthHasOneOrTwoChar(){
        String s1=Task11ReturnMiddleTwoElementsInString.middleTwo("co");
        String s2=Task11ReturnMiddleTwoElementsInString.middleTwo("s");

        String expected1= "co";
        String expected2= "s";

        assertEquals(expected1,s1);
        assertEquals(expected2,s2);

    }

}