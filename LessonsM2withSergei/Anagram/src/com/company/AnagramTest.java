package com.company;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi", "navi", "annna");
    private Anagram anagram;
    @Before    //private Anagram anagram =new Anagram(VOC);

    public void setUp(){
         anagram = new Anagram(VOC);

    }

    @Test
    public void testAnagram() {
       // List<String> voc = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi", "navi", "annna");
        String word = "anna";
        List<String> expected = Arrays.asList("anna", "naan");

        List<String> actual = anagram.getAnagram(word);


        assertEquals(expected, actual);
       // anagram.getAnagram("ivan");
       // anagram.getAnagram("vani");
       // anagram.getAnagram("naan");
    }

}