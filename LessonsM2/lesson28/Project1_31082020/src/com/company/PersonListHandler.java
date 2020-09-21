package com.company;

import java.util.ArrayList;
import java.util.List;

public class PersonListHandler {
    //Function<Person,List<String>> qwe;

/*
        qwe  -> ewq
        qwe1 -> 1ewq
        qwe2 -> 2ewq


        (list, Predicate, Function<String,String>)
        for(){
            if(predicate){
            Function.apply
            }
        }


 */

    private static String type="email";



    public static List<String> personListHandler(List<Person> people, String type){
        List<String> list=new ArrayList<>();
        if(people!=null){
            for (Person person: people){
                List<PersonAddress> tempAddressList = person.getAddresses("email");
                String nameString = person.getFirstName() + ' ' + person.getSecondName();
                for (PersonAddress adr : tempAddressList){
                    list.add(new String(adr.getAddress()+' '+ nameString));
                }
            }
        }
        return list;
    }

    private static List<String> personListHandler(List<Person> people){
        return personListHandler(people,"email");
    }
}
