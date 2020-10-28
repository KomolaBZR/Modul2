package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//Task 3 (List) Test

class ListTask3ComparisonTwoArraysWithSameLengthByTheirElementsTest {
    @Test
    public void testListTask3_ComparisonTwoArraysWithSameLengthByTheirElements_WithoutNull(){

        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,2,3,8);

        List<String> expected= Arrays.asList("No","Yes","Yes","No");

        assertEquals(expected,ListTask3ComparisonTwoArraysWithSameLengthByTheirElements.resultOfComparison(list1,list2));
    }


    @Test
    public void testListTask3_ComparisonTwoArraysWithSameLengthByTheirElements_Null(){
        List<Integer> list = Arrays.asList(1,2,3,4);

        assertEquals(null,ListTask3ComparisonTwoArraysWithSameLengthByTheirElements.resultOfComparison(null, list));
        assertEquals(null,ListTask3ComparisonTwoArraysWithSameLengthByTheirElements.resultOfComparison(list,null));
        assertEquals(null,ListTask3ComparisonTwoArraysWithSameLengthByTheirElements.resultOfComparison(null,null));

    }

}