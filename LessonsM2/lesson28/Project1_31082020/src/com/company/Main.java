package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       /* Person p1=null;
        try{
            p1 =new Person(null,"second1");
        }catch (Exception e){
            System.out.println("person is not created");
        }
        System.out.println(p1);*/


PersonAddress address=new PersonAddress("adr1",AddressType.POST);
        System.out.println(address.getType());
        System.out.println(address.getType().equals("POST"));
        System.out.println(address.getType().equals(AddressType.POST));
        System.out.println(address.getType()==(AddressType.POST));
        System.out.println(address.getType()==AddressType.valueOf("EMAIL"));
        System.out.println(address.getType().equals(AddressType.valueOf("POST")));
        System.out.println(AddressType.EMAIL==AddressType.valueOf("EMAIL"));
        System.out.println(AddressType.EMAIL.equals(AddressType.valueOf("EMAIL")));

        System.out.println("------------------------------");
        PersonAddress address1=null;
        try {
            address1 = new PersonAddress("adr1", "POST");
        }catch (Exception ex){}

        System.out.println(address1);
        System.out.println("------------------------------");//enum

        AddressType[] addressTypes=AddressType.values();//enum
        for(int i=0; i<addressTypes.length;i++){
            System.out.println(addressTypes[i]);
        }

        PersonAddress address2=new PersonAddress("adr1",AddressType.EMAIL);
        PersonAddress address3=new PersonAddress("adr1",AddressType.POST);

        System.out.println(address.getType().test());
        System.out.println(address2.getType().test1());
        System.out.println(address3.getType().test1());
        System.out.println("---------------------------------");
        System.out.println(address);
        System.out.println("--------------------------------------------");
        address.send();

       /* for(int i=0; i<AddressType.values().length;i++){
            System.out.println(AddressType.values()[i]);
        }*/

	    /*

	    Person p1=new Person("first1","second1");
	    p1.addAddress(new PersonAddress("adr1","post"));
        p1.addAddress(new PersonAddress("adr2","billing"));
        p1.addAddress(new PersonAddress("adr3","email"));
        p1.addAddress(new PersonAddress("adr4","email"));

        Person p2=new Person("first2","second2");
        p2.addAddress(new PersonAddress("2adr1","post"));
        p2.addAddress(new PersonAddress("2adr2","billing"));
        p2.addAddress(new PersonAddress("2adr3","email"));
        p2.addAddress(new PersonAddress("2adr4","email"));

        Person p3=new Person("first3","second3");
        p3.addAddress(new PersonAddress("3adr1","post"));
        p3.addAddress(new PersonAddress("3adr2","billing"));
        p3.addAddress(new PersonAddress("3adr3","email"));
        p3.addAddress(new PersonAddress("3adr4","email"));

        List<Person> people=new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

       // System.out.println(PersonListHandler.personListHandler(people));



        List<PersonAddress> tempList=p1.getAddresses("email");
        System.out.println(tempList);



        System.out.println(p1);

	 */
    }

    public static List<String> personListHandler(List<Person> person){
return null;
    }
}
