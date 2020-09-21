package com.company;

public class Trees extends Plants {
    public Trees (String plant, int years) {
        super(plant,years);
    }


    public double getEarlyGrowthTrees() {
        return 150; //centimeter
    }

    @Override
    public double plantGrowthInSpring() {
        return 15;
    }

    @Override
    public double plantGrowthInSummer() {
        return 15;
    }

    @Override
    public double plantGrowthInAutumn() {
        return 5;
    }

    @Override
    public double plantGrowthInWinter() {
        return 5;
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

    @Override
    public String toString() {
        if(getYears()==1) {
                return "Tree \"" +getPlant()+"\" has grown in a year: " + plantGrowthInTheSpaceOfAYear()+ " centimeter.";}
        if(getYears()>1){
                return "Tree \"" +getPlant()+"\"  has grown in " + getYears()
                        + " years: " + plantGrowthInTheSpaceOfYears()+ " centimeter" +" or "
                        +(plantGrowthInTheSpaceOfYears()/100)+ " meter.";}
        if(getYears()==0){
                return "Early growth tree is 1.50 meter.";}
        else{
            return "not exist";}
    }
}
