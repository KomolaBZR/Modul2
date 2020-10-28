package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//Task 4 (List) Test

class ListTask4CheckingForCyclicalityOfTwoArraysTest {

    @Test
    public void testListTask4_checkIfThereIsCyclicityBetweenTwoArrays_SameLength_WithoutNull_Cyclicity_True(){
        List<String> list1= Arrays.asList("aa", "bb", "cc", "dd");
        List<String> list2=Arrays.asList("cc", "dd", "aa", "bb");
        assertTrue(ListTask4CheckingForCyclicalityOfTwoArrays.checkIfThereIsCyclicityBetweenTwoArrays(list1,list2));;
    }

    @Test
    public void testListTask4_checkIfThereIsCyclicityBetweenTwoArrays_SameLength_WithoutNull_NoCyclicity_False(){
        List<String> list1= Arrays.asList("dd", "ee", "ff");
        List<String> list2=Arrays.asList("dd", "ff", "ee");
        assertFalse(ListTask4CheckingForCyclicalityOfTwoArrays.checkIfThereIsCyclicityBetweenTwoArrays(list1,list2));
    }

    @Test
    public void testListTask4_checkIfThereIsCyclicityBetweenTwoArrays_DifferentLength_WithoutNull_False(){
        List<String> list1= Arrays.asList("dd", "ff");
        List<String> list2=Arrays.asList("dd", "ff", "ee");
        assertFalse(ListTask4CheckingForCyclicalityOfTwoArrays.checkIfThereIsCyclicityBetweenTwoArrays(list1,list2));
    }


    @Test
    public void testListTask4_checkIfThereIsCyclicityBetweenTwoArrays_Null(){
        List<String> list= Arrays.asList("aa", "bb", "cc", "dd");
        assertFalse(ListTask4CheckingForCyclicalityOfTwoArrays.checkIfThereIsCyclicityBetweenTwoArrays(null, list));
        assertFalse(ListTask4CheckingForCyclicalityOfTwoArrays.checkIfThereIsCyclicityBetweenTwoArrays(list,null));
        assertFalse(ListTask4CheckingForCyclicalityOfTwoArrays.checkIfThereIsCyclicityBetweenTwoArrays(null,null));
    }

}