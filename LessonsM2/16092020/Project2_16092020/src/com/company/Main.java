package com.company;

import java.util.*;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {




        Person p1=new Person("Ivan", Arrays.asList
                (new Address("address1","mail"),new Address("add1","billing")));
        Person p2=new Person("Anna",Arrays.asList(new Address("address2","post")));
        Person p3=new Person("Nick",Arrays.asList(new Address("address3","mail")));
        Person p4=new Person("Paul",Arrays.asList(new Address("address4","post")));

        List<Person> people=new ArrayList<>(asList());
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        //System.out.println(people);
        //System.out.println(getPersonWithAddresses(people));
        //System.out.println(getPersonNamesWithAddresses(people));
        //System.out.println(getPersonNamesWithAddressesTwo(people));
        System.out.println(getPersonWithAddressesTwo(people));

    }

    public static Map<Person, Set<Address>> getPersonWithAddresses(List<Person> people){
        Map<Person,Set<Address>> result = new HashMap<>();
        for(Person p: people){
            Set<Address> addresses=new HashSet<>(p.getAddress());
            result.put(p,addresses);

        }

        return result;
    }
    public static Map<String, Set<Address>> getPersonNamesWithAddresses(List<Person> people){
        Map<String,Set<Address>> result = new HashMap<>();
        for(Person p: people){
            Set<Address> addresses=new HashSet<>(p.getAddress());

                result.put(p.getName(), addresses);
        }

        return result;
    }

    public static Map<Person, Set<Address>> getPersonWithAddressesTwo(List<Person> people){
        Map<Person,Set<Address>> result = new HashMap<>();
        for(Person p: people){
            Set<Address> addresses=new HashSet<>(p.getAddress());
            if(result.containsKey(p)){
                result.get(p).addAll(p.getAddress());
            }else {
                result.put(p, addresses);
            }

        }

        return result;
    }

    public static Map<String, Set<Address>> getPersonNamesWithAddressesTwo(List<Person> people){
        Map<String,Set<Address>> result = new HashMap<>();
        for(Person p: people){
            Set<Address> addresses=new HashSet<>(p.getAddress());
            if(result.containsKey(p.getName())){
                result.get(p.getName()).addAll(p.getAddress());

            }else {
                result.put(p.getName(), addresses);
            }
        }
        return result;
    }

}
