package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] clients = new String[] {":Til Schweiger DE15971891",
                "AG:Microsoft DE15978765", "GmbH:Pupkin SoftLab DE15954356",
                "e.V.:Pupkin SoftLab DE15954356"};
        System.out.println(Arrays.toString(clients));
        CommonInfo[] infoArray=cardClient(clients);
        printArrayCard(infoArray);
    }

    public static void printArrayCard(CommonInfo[] info){
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
    }


    public static CommonInfo[] cardClient(String[] array){
        CommonInfo[] infoArray = new CommonInfo[array.length];
        for(int i=0; i<array.length; i++) {
            String[] rez = array[i].split("DE");
            if(rez[i].startsWith("DE")){
                if(rez[i].startsWith(":")){
            infoArray[i] = new CommonInfo(new Person(rez[1]), rez[0]);
                } else {infoArray[i] = new CommonInfo(new Companies(rez[1]), rez[0]);
            }

            }
            else {
                if(rez[1].startsWith(":")){
                infoArray[i] = new CommonInfo(new Person(rez[0]),rez[1]);}
                else {infoArray[i] = new CommonInfo(new Companies(rez[0]),rez[1]);
                }
            }
        }
        return infoArray;
    }
}
