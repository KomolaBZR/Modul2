package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ParameterSetting number= new ParameterSetting();
        int result = MathematicalEssentialCalculations.calc(ParameterSetting.getA(),ParameterSetting.getB(),
                MathematicalEssentialCalculations.getOperation());
        System.out.println("Результат операции: "+result);
        ParameterSetting number1= new ParameterSetting();
        int result1 = MathematicalEssentialCalculations.calc(ParameterSetting.getA(),ParameterSetting.getB(),
                MathematicalEssentialCalculations.getOperation());
        System.out.println("Результат операции: "+result1);
    }
}
