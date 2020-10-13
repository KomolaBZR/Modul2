package com.company;

public interface DemoInterface {
    String SOME_STRING="Hello";
    String getString(int i);

    //String transform(int i);


     default String transform(int i){
        return "Hello World";
    }
}
