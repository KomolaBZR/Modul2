package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3BasicEndUppercaseTest {

    @Test
    public void testBasicEndUppercase_TheLengthOftheStringIsLargerThan3Char(){
        String s1= Task3BasicEndUppercase.endUp("Hello");
        String s2=Task3BasicEndUppercase.endUp("hi there");

        String expected1= "HeLLO";
        String expected2= "hi thERE";
        assertEquals(expected1,s1);
        assertEquals(expected2,s2);
    }
    @Test
    public void testBasicEndUppercase_TheLengthOftheStringIsSmallerThan3Char(){
        String s1=Task3BasicEndUppercase.endUp("hi");
        String expected1= "HI";
        assertEquals(expected1,s1);
    }



}