package com.company;

public class ArraysBlockForPlants {
    private static Plants[] plants = {
            new Trees("Oak", 52),
            new Trees("Spruce", 40),
            new Trees("Apple-tree", 5),
            new Trees("Birch", 15),
            new Bushes("Blackcurrant", 8),
            new Bushes("Aloe",10),
            new Bushes("Jasmine",3),
            new Bushes("Magnolia",7),
            new Flowers("Lily",1),
            new Flowers("Rose",0),
            new Flowers("Daisy",1),
            new Flowers("Iris", 2)
    };

    public static Plants[] getPlants(){
        return plants;
    }


}
