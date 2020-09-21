package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] bankData = new String[] {"1264737593038574 Danil","1364737593038574 Jack", "1264737593038574 Bob"};
//        System.out.println(Arrays.toString(cardClient(bankData)));
        Card[]cards=cardClient(bankData);
        printArrayCard(cards);
        System.out.println(Arrays.toString(cardClient(bankData)));

    }

    public static Card[] cardClient(String[] array){
        Card[] cards = new Card[array.length];
        for(int i=0; i<array.length; i++){
            String[] rez = array[i].split(" ");
            switch (getCardType(rez[0])){
                case 1:
                    cards[i]= new Master(new Person(rez[1]),rez[0]);
                    break;
                case 2:
                    cards[i]= new Visa(new Person(rez[1]),rez[0]);
                    break;
                default:
                    System.out.println("error");
            }
        //    cards[i]= new Card(new Person(rez[1]),rez[0]);

        }


        return cards;
    }

    public static int getCardType(String number) {
        int type=0;
        if(number.startsWith("12")){return 1;}
        if (number.startsWith("13"))return 2;
        return 404;
    }

    //public static Card[] showVisaCard(String[] array){


    public static void printArrayCard(Card[] cards){
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }

    public static void printArrayCard1(Card[] cards){
        for (Card card: cards) {
            System.out.println(card.toSecureString());
        }
    }

}
