package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
//Task 1 (Map) Test

class MapTask1GetMapABTest {
    @Test
    public void testMapTask1_getMapAB_WithoutNullOrEmpty(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        expected.put("b", "There");
        expected.put("ab", "HiThere");
        assertEquals(expected,MapTask1GetMapAB.getMapAB(map,"a","b"));;
    }

    @Test
    public void testMapTask1_getMapAB_Null(){
        Map<String, String> map =null;
        assertNull(MapTask1GetMapAB.getMapAB(map,"a", "b"));

    }
    @Test
    public void testMapTask1_getMapAB_Empty(){
        Map<String, String> map = new HashMap<>();
        assertEquals(map, MapTask1GetMapAB.getMapAB(map, "a", "b"));

    }

}