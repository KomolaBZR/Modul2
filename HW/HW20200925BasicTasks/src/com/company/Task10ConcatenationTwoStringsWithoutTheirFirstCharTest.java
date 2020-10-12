package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10ConcatenationTwoStringsWithoutTheirFirstCharTest {

    @Test
    public void testConcatenationTwoStringsWithoutTheirFirstChar(){
        String s1= Task10ConcatenationTwoStringsWithoutTheirFirstChar.nonStart("Hello","There");
        String s2=Task10ConcatenationTwoStringsWithoutTheirFirstChar.nonStart("java","code");
        String s3=Task10ConcatenationTwoStringsWithoutTheirFirstChar.nonStart("shotl","java");

        String expected1= "ellohere";
        String expected2= "avaode";
        String expected3= "hotlava";
        assertEquals(expected1,s1);
        assertEquals(expected2,s2);
        assertEquals(expected3,s3);

    }

}