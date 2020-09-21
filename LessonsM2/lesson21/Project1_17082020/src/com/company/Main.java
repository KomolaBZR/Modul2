package com.company;

public class Main {

    public static void main(String[] args) {
       // Address address=new Address("Berlin","Tauban str");
        Person p1 = new Person("Jack",new Address("Berlin","Tauban str"));
        Person p2 = new Person("Nick", new Address("Berlin","Tauban str"));
        Person p3 = new Person("Jack",new Address("Berlin","Tauban str"));

       // System.out.println(p1==p2);
 /*       if(p1==p2){
            System.out.println("p1 is equals to p2");
        }else{
            System.out.println("p1 isn't equals to p2");
        }*/
      //  System.out.println(p1==p3); //false она сравнивает адреса и смотрят на разные объукты
       // System.out.println(p1.equals(p3)); //false она сравнивает адреса и смотрят на разные объукты
       // System.out.println(p1.getName().equals(p3.getName()));
        System.out.println(p1.equals(p3));


    }
}
