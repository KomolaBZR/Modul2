package com.company;
import java.util.Scanner;


public class ParameterSetting {
    static Scanner scanner = new Scanner(System.in);
    private static int a=getIn();
    private static int b=getIn();

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public ParameterSetting () {

    }
    public static int getIn(){
        System.out.println("Введите число:");
        int number;
        if(scanner.hasNextInt()){
            number=scanner.nextInt();
        }else{
            System.out.println("Error");
            scanner.next();//рекурсия
            number=getIn();
        }
        return number;
    }

    }

