package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.company.Main.getNewListOfDuplicatedPersons;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void getNewListOfDuplicatedPersons_twoListDuplicatedPersons(List<Person> list1, List<Person> list2){
        List<Person> list1=new ArrayList<>();
        list1.add(new Person("Oleg"));
        list1.add(new Person("Lora"));
        list1.add(new Person("Oleg"));
        list1.add(new Person("David"));

        List<Person> list2=new ArrayList<>();
        list2.add(new Person("Oleg"));
        list2.add(new Person("Lora"));
        list2.add(new Person("Anna"));
        list2.add(new Person("Roma"));

        Set<Person> set1=new HashSet<>();
        set1.add(new Person("Oleg"));
        set1.add(new Person("Lora"));

        assertEquals(set1, new HashSet<Person>(getNewListOfDuplicatedPersons(list1,list2)));


    }


    @Test
    public void getNewListOfDuplicatedPersons_firstListIsEmpty_emptyList(){
        List<Person> list1=new ArrayList<>();

        List<Person> list2=new ArrayList<>();
        list2.add(new Person("Oleg"));
        list2.add(new Person("Lora"));
        list2.add(new Person("Anna"));
        list2.add(new Person("Roma"));


        assertEquals(new ArrayList<Person>(), new HashSet<Person>(getNewListOfDuplicatedPersons(list1,list2)));

    }



}