package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionToStringTest {
    @Test
    public void apply_nullString_emptyList(){
        //List<String> str =null;
        FunctionToString function=new FunctionToString();
        List<String> str1= new ArrayList<>();
        assertEquals(function.apply(null,new PredicatePalindrome()),str1);
    }

    @Test
    public void apply_palindromeList_palindromeList(){
        List<String> listIn=new ArrayList<>();
        listIn.add("poiuyuiop");
        listIn.add("qwertrewq");
        listIn.add("jhglsdfhgsdrf");
        listIn.add("m.b;slkv.");

        List<String> listOut=new ArrayList<>();
        listOut.add("poiuyuiop");
        listOut.add("qwertrewq");
        FunctionToString function=new FunctionToString();
        assertEquals(listOut, function.apply(listIn, new PredicatePalindrome()));

    }

    @Test
    public void apply_noPalindromeList_emptyList() {
        List<String> listIn=new ArrayList<>();
        listIn.add("jhglsdfhgsdrf");
        listIn.add("m.b;slkv.");
        List<String> listOut=new ArrayList<>();
        FunctionToString function=new FunctionToString();
        assertEquals(listOut, function.apply(listIn, new PredicatePalindrome()));

    }



}