package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//Task 7 (List) Test

class ListTask7ReturnListWithoutElementsGreaterThanXTest {
    @Test
    public void testListTask7_ReturnListWithoutElementsGreaterThanXTest_NoNull(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> expected= Arrays.asList(1,2,3,4);
        assertEquals(expected, ListTask7ReturnListWithoutElementsGreaterThanX
                .getNewListWithoutElementsGreaterThanX(list,5));
    }


    @Test
    public void testListTask7_ReturnListWithoutElementsGreaterThanXTest_Null(){
        assertNull(ListTask7ReturnListWithoutElementsGreaterThanX
                .getNewListWithoutElementsGreaterThanX(null,5));
    }


}