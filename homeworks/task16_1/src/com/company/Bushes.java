package com.company;

public class Bushes extends Plants {
    public Bushes(String plant, int years) {
        super(plant, years);
    }


    public double getEarlyGrowthTrees() {
        return 40; //centimeter
    }

    @Override
    public double plantGrowthInSpring() {
        return 10;
    }

    @Override
    public double plantGrowthInSummer() {
        return 10;
    }

    @Override
    public double plantGrowthInAutumn() {
        return 3;
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
        return plantGrowthInTheSpaceOfAYear()*getYears();
    }
    public String toString() {
        if(getYears()==1) {
            return "Bush  \"" +getPlant()+"\" has grown in a year: "+plantGrowthInTheSpaceOfAYear()+ " centimeter";}
        if(getYears()>1)
        {return "Bush \"" +getPlant()+"\" has grown in "+getYears()+" years: " +plantGrowthInTheSpaceOfYears()+" centimeter" +" or "
                +(plantGrowthInTheSpaceOfYears()/100)+ " meter.";}
        if(getYears()==0)
            return "Early growth bush \"" +getPlant()+ "\" is 40 centimeter.";
        else
            return "not exist";
    }
}
