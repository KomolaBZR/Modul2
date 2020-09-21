package com.company;

public abstract class Plants {
    private String plant;
    private int years;

    public Plants(String plant, int years) {
        this.plant=plant;
        this.years=years;
    }

    public String getPlant() {
        return plant;
    }


    public int getYears() {
        return years;
    }

    public abstract double plantGrowthInSpring();
    public abstract double plantGrowthInSummer();
    public abstract double plantGrowthInAutumn();
    public abstract double plantGrowthInWinter();
    public abstract double plantGrowthInTheSpaceOfAYear();



    public abstract double plantGrowthInTheSpaceOfYears();


    @Override
    public String toString() {
        return "Plants{" +
                "plant='" + plant + '\'' +
                '}';
    }
}
