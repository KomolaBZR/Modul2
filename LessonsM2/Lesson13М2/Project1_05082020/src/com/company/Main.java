package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        String[] names ={"Jack","Nick","John"};
        System.out.println("Nick".compareTo("John"));


        Arrays.sort(names);
        System.out.println(Arrays.toString(names));



        Person[] people={new Person("Jack",50),
                new Person("Nick 12",25),
                new Person("John 123",23),
                new Person("Anna 1456",18),
                new Person("Anna 1",23),
                new Person("Nick 100",18),
                new Person("John 56",23)};

        //System.out.println(people[0].compareTo(people[1]));

        //Arrays.sort(people);


        Comparator<Person> typeOfSorting;
        int key=3;
        switch (key){
            case 1: //sort by age
                System.out.println("sort by age: ");
                typeOfSorting = new PersonComparatorByAge();
                Arrays.sort(people,typeOfSorting);
                System.out.println(Arrays.toString(people));
                break;
            case 2:    //sort by name
                System.out.println("sort by name: ");
                typeOfSorting=new PersonComparatorByName();
                Arrays.sort(people,typeOfSorting);
                break;
            case 3: //sort by name length
                System.out.println("sort by name length: ");
                typeOfSorting=new PersonComparatorByNameLength();
                Arrays.sort(people,typeOfSorting);
                break;


 //           case 4:
 //               Arrays.sort(people,(o1,o2)->o1.getAge()-o2.getAge());
            default:
                System.out.println("sort by default: ");
                Arrays.sort(people);
        }


  //      System.out.println(Arrays.toString(people));
  //     System.out.println("sort by age: ");
  //   Arrays.sort(people,new PersonComparatorByAge());
  //    System.out.println(Arrays.toString(people));
   //        System.out.println("sort by name: ");
  //      Arrays.sort(people,new PersonComparatorByName());
        System.out.println(Arrays.toString(people));

    }
}
