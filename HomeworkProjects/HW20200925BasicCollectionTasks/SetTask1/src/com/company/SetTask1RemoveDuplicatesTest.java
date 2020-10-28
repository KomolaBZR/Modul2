package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//  Task 1 (Set) Test

class SetTask1RemoveDuplicatesTest {
    @Test
    public void testSetTask1_RemoveDuplicates_NoNull(){
        List<String> list= Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        List<String> expected= Arrays.asList("Ivan", "Maria", "Piotr", "Anna");
        assertEquals(expected, SetTask1RemoveDuplicates.removeDuplicates(list));
    }


    @Test
    public void testSetTask1_RemoveDuplicates_Null(){
        assertNull(SetTask1RemoveDuplicates.removeDuplicates(null));
    }



}