package com.company;

public class Manager extends Employee implements ManageAble{

    private double managerBonus;
    public Manager(String name, double salary, double managerBonus) {
        super(name,salary);
        this.managerBonus=managerBonus;
    }
    public void manage(){
        System.out.println("all managers can manage!");
    }
    public void pay(){

        System.out.println("pay for manager"+ getSalary()+
                "bonus "+managerBonus
                +" euro for " +getSalary());
    }

    @Override
    public void work() {

    }

}
