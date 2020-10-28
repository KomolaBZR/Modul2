package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//Task 6 (List) Test

class ListTask6CombiningTwoListsIntoOneTest {
    @Test
    public void testListTask6_combiningTwoListsIntoOne_WithoutNull(){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        assertEquals(expected,ListTask6CombiningTwoListsIntoOne.combineTwoListsIntoOne(list1,list2));;
    }

    @Test
    public void testListTask6_getReverseList_Null(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertNull(ListTask6CombiningTwoListsIntoOne.combineTwoListsIntoOne(null,null));
        assertNull(ListTask6CombiningTwoListsIntoOne.combineTwoListsIntoOne(list,null));
        assertNull(ListTask6CombiningTwoListsIntoOne.combineTwoListsIntoOne(null,list));
    }

}