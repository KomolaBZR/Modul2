package com.company;

import java.util.Scanner;

public class GuessNumber {
    static int secretNumber=2;
    static int attempts=3;

    private NumberInput numberInput;

    public GuessNumber (NumberInput numberInput){
        this.numberInput =numberInput;
    }


    public void game() {
        System.out.println("Try to guess a secret number: ");
        int number = numberInput.getNextNumber();

        boolean correctGuess=false;
        while (attempts>1 && !correctGuess) {
            if(secretNumber==number){
                correctGuess=true;
            }else{
                System.out.println("Wrong number, try again");
                number = numberInput.getNextNumber();
            }
            attempts--;

        }

        if(correctGuess){
            System.out.println("Congratulation, you won!");
        } else{
            System.out.println("You failed!");
        }

        System.out.printf("You entered "+number);
    }

    public static void main(String[] args){

        NumberInput input=new KeyboardInput();
        GuessNumber number= new GuessNumber(input);
        number.game();
    }
}
