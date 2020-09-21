package com.company;
import java.util.Scanner;

public class MathematicalEssentialCalculations {
    static Scanner scanner = new Scanner(System.in);
    ParameterSetting a;
    ParameterSetting b;


    public MathematicalEssentialCalculations(ParameterSetting a, ParameterSetting b) {
        this.a = a;
        this.b = b;
    }
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }


    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Error. Try again. (Choose between '+', '-', '*' and '/' )");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }

}
