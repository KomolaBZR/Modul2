package com.company;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    //:Til Schweiger Iban:DE15971891
    //AG:Macrosoft Iban:DE15978765
    //GmbH:Pupkin SoftLab Iban:DE15954356
    //e.V.:PupkinSoftLab Iban:DE15954356

    public static void main(String[] args) {
        String[] strings = new String[]{
                ":Til Schweiger Iban:DE15971891",
                "AG:Macrosoft Iban:DE15978765",
                "GmbH:Pupkin SoftLab Iban:DE15954356",
                "e.V.:PupkinSoftLab Iban:DE15954356"
        };

        Account[] account = Parser.parseStringArrayToAccounts(strings, new ParserString());
        System.out.println(Arrays.toString(account));
        System.out.println("------------");
        Account[] account2 = Parser.parseStringList(strings, new ParserString());
        System.out.println(Arrays.toString(account2));
    }


}
