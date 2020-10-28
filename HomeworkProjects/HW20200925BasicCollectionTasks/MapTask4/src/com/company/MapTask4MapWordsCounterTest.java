package com.company;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
//Task 4 (Map) Test

class MapTask4MapWordsCounterTest {
    @Test
    public void testMapTask4_MapWordsCounter_WithoutNullOrEmpty(){
        List<String> list= new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Anna", "Katja", "Pasha", "Jack", "Jack", "Anna","Pasha"));

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Katja", 1);
        expected.put("Jack", 2);
        expected.put("Pasha", 2);
        expected.put("Anna", 3);

        assertEquals(expected,MapTask4MapWordsCounter.mapWordsCounter(list));;
    }
    @Test
    public void testMapTask4_MapWordsCounter_Empty(){
        List<String> list= new ArrayList<>();
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected,MapTask4MapWordsCounter.mapWordsCounter(list));;
    }
    @Test
    public void testMapTask4_MapWordsCounter_Null(){
        List<String> list= null;
        assertNull(MapTask4MapWordsCounter.mapWordsCounter(list));;
    }




}