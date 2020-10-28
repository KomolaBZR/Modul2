package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//Task 2 (Set) Test

class SetTask2getDuplicatesTest {
    @Test
    public void testSetTask2_getDuplicates_NoNull(){
        List<String> list= Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        List<String> expected= Arrays.asList("Maria","Ivan");
        assertEquals(expected, SetTask2getDuplicates.getDuplicates(list));
    }

    @Test
    public void testSetTask2_getDuplicates_Null(){
        assertNull(SetTask2getDuplicates.getDuplicates(null));
    }
}