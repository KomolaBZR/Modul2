package com.company;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
  /*public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }*/

  /*  public int compareTo(Person person){
        if(this.age>person.age){
            return 1;
        }
        if(this.age<person.age){
            return -1;
        }

        return 0;
    }
*/


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name ='" + name + '\'' +
                ", age =" + age +
                '}';
    }

  /*  @Override
    public int compareTo(Person person) {
        return this.age- person.age;
    }*/

   /* public int compareTo(Person person){
        if (this.name.compareTo(person.name)==0){
        return this.age-person.age;}
        return this.name.compareTo(person.name);
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Person person){
        int nameComparing=this.name.compareTo(person.name);
        if (nameComparing==0){
            return this.age-person.age;}
        return nameComparing;
    }
}
