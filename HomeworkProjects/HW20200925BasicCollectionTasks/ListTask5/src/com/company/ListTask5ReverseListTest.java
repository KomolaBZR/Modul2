package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//Task 5 (List) Test

class ListTask5ReverseListTest {

    @Test
    public void testListTask5_getReverseList_WithoutNull(){
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        List<Integer> expected = Arrays.asList(5,4,3,2,1);
        assertEquals(expected,ListTask5ReverseList.getReverseList(list));;
    }

    @Test
    public void testListTask5_getReverseList_Null(){
       assertNull(ListTask5ReverseList.getReverseList(null));
    }


}