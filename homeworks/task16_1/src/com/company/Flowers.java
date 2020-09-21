package com.company;

public class Flowers extends Plants {
    public Flowers (String plant, int years) {
        super(plant, years);
    }


    public double getEarlyGrowthTrees() {
        return 0; //centimeter
    }

    @Override
    public double plantGrowthInSpring() {
        return 20;
    }

    @Override
    public double plantGrowthInSummer() {
        return 10;
    }

    @Override
    public double plantGrowthInAutumn() {
        return 0;
    }

    @Override
    public double plantGrowthInWinter() {
        return 0;
    }

    @Override
    public double plantGrowthInTheSpaceOfAYear() {
        return (getEarlyGrowthTrees()+plantGrowthInSpring()+plantGrowthInSummer()
                +plantGrowthInAutumn()+plantGrowthInWinter());
    }

    @Override
    public double plantGrowthInTheSpaceOfYears() {
        if(getYears()<2&&getYears()>0)
            return plantGrowthInTheSpaceOfAYear()*getYears();
        else
            return 0;
    }
    public String toString() {
        if(getYears()==1) {
            return "Flowers \"" +getPlant()+ "\" have grown in a year: "+plantGrowthInTheSpaceOfAYear()+" centimeter.";}
        else
            return "Flowers \"" +getPlant()+ "\" are seed or not exist or have been cut (0 cm).";
    }
}
