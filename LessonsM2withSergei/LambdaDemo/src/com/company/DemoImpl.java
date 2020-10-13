package com.company;

public class DemoImpl implements  DemoInterface{

    int anInt;

    @Override
    public String getString(int i) {
        return String.valueOf(i);
    }

    @Override
    public String transform(int i) {
        anInt=3;
        return "Hello World " +i + anInt; //return "Hello World " + String.valueOf(i);
    }

    // String something= DemoImpl.SOME_STRING;

}
