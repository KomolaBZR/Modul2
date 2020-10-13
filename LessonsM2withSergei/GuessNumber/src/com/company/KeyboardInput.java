package com.company;

import java.util.Scanner;

public class KeyboardInput implements NumberInput{
    static Scanner scanner = new Scanner(System.in);


    @Override
    public int getNextNumber() {
        return scanner.nextInt();
    }
}
