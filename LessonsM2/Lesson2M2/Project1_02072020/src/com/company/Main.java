package com.company;

public class Main {

    public static void main(String[] args) {

        Manager m1=new Manager("m1",1000.0,100);
        Manager m2=new Manager("m2",1001.0,100);
        ProgrammManager pm1=new ProgrammManager("3",2000.0);

        ManageAble[] emp={m1,m2,pm1};
        emp[0].manage();


        ManageAble qwe= new Manager("m2",1001.0,100);





        Programmer[] programmers = DBMock.getProgrammers();
        for (Programmer programmer:programmers){
            System.out.println(programmer.getName());
            System.out.println(" ");
            programmer.codeReview();

        }

        Employee[] employees=DBMock.getEmployees();
        for(Employee employee: employees){
            payForEmployee(employee);
        }

        for(Employee employee: employees){
            System.out.println(employee.toString());;
        }


    }
    public static boolean isBonus(String[] bonusList, String name){
        for(String str: bonusList){
            if(str.equals(name)){
                return true;
            }
        }
        return false;
    }

    public static void payForEmployee(Employee employee){

    }
}
