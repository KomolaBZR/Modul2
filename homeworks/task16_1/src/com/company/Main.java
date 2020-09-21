package com.company;

public class Main {

    public static void main(String[] args) {
        Plants[] plants= ArraysBlockForPlants.getPlants();

        for(Plants plant: plants){
            System.out.println(plant.toString());;
        }
    }
}
