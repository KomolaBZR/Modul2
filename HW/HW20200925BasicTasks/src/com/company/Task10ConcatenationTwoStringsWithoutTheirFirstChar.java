package com.company;

public class Task10ConcatenationTwoStringsWithoutTheirFirstChar {
    //Даны две строки,вернуть их конкатенацию,
    // но без первого символа в каждой. Строки ненулевой длины.
    //nonStart("Hello", "There") → "ellohere"
    // nonStart("java", "code") → "avaode"
    // nonStart("shotl", "java") → "hotlava"
    //public String nonStart(String a, String b) { }

    public static String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }

}
