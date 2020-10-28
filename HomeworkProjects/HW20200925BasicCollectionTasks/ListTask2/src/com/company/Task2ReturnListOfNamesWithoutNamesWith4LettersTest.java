package com.company;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//Task 2 (List) Test

class Task2ReturnListOfNamesWithoutNamesWith4LettersTest {
    @Test
    public void testListTask2_sortedNamesByLength_Null(){
        assertNull(Task2ReturnListOfNamesWithoutNamesWith4Letters.sortNamesByLength(null));
    }

    @Test
    public void testListTask2_sortedNamesByLength_LessThan4Chars(){
        List<String> names = new ArrayList<> ();
        names.add("Ivan");
        names.add("Nick");
        names.add("Anna");
        names.add("John");

        List<String> expected = new ArrayList<> ();

        assertEquals(expected,Task2ReturnListOfNamesWithoutNamesWith4Letters.sortNamesByLength(names));
    }

    @Test
    public void testListTask2_sortedNamesByLength_differentLength(){
        List<String> names = Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia");
        List<String> expected = Arrays.asList( "Maria", "Stephan", "Amalia");

        assertEquals(expected,Task2ReturnListOfNamesWithoutNamesWith4Letters.sortNamesByLength(names));
    }

}