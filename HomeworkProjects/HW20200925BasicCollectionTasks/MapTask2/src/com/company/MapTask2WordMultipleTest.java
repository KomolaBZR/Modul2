package com.company;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

// Task 2 (Map) Test

class MapTask2WordMultipleTest {
    @Test
    public void testMapTask2_getWordMultiple_WithoutNullOrEmpty_MixTrueAndFalse(){
        String[] array = {"a", "b", "a", "c", "b"};

        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);

        assertEquals(expected,MapTask2WordMultiple.wordMultiple(array));;
    }

    @Test
    public void testMapTask2_getWordMultiple_WithoutNullOrEmpty_OnlyTrue(){
        String[] array = {"a", "a", "b", "b"};

        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);

        assertEquals(expected,MapTask2WordMultiple.wordMultiple(array));;
    }
    @Test
    public void testMapTask2_getWordMultiple_WithoutNullOrEmpty_OnlyFalse(){
        String[] array = {"c", "a", "b"};

        Map<String, Boolean> expected = new HashMap<>();
        expected.put("c", false);
        expected.put("a", false);
        expected.put("b", false);

        assertEquals(expected,MapTask2WordMultiple.wordMultiple(array));;
    }
    @Test
    public void testMapTask2_getWordMultiple_Empty(){
        String[] array={};
        Map<String, Boolean> expected = new HashMap<>();
        assertEquals(expected, MapTask2WordMultiple.wordMultiple(array));
    }
    @Test
    public void testMapTask2_getWordMultiple_Null(){
        assertNull(MapTask2WordMultiple.wordMultiple(null));
    }
}