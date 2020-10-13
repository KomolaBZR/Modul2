package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
        Comparator<String> c=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        DemoInterface demo =new DemoImpl();
        System.out.println(demo.transform(5));
        String someString=DemoInterface.SOME_STRING;

       /* DemoInterface di=(a) ->{
            return String.valueOf(a);
        };*/

        DemoInterface dia = new DemoInterface() { // the same as "DemoInterface di=(a) -> String.valueOf(a);"
            @Override
            public String getString(int i) {
                return String.valueOf(i);
            }
        };

        DemoInterface di=(a) -> String.valueOf(a);

        Function<String, Integer> f1=(String s) -> s.length();

        Integer hello = f1.apply("hello");

        System.out.println(hello);

        //5 -?

        Function<Integer, Integer> f2=(a) -> a*a;


        //"abc" ->false
        //"aabb" -> true

        Predicate<String> f3 = (s) ->s.length()%2 ==0;
        //Predicate<String> f3 = (s) ->{ returns.length()%2 ==0;};
  /*      {
            if(s.length()%2 ==0) return true;
            else return false;
        };*/
        System.out.println(f3.test("aaab"));

        // System.out.println

        Consumer<String> f4=(s) -> System.out.println(s);

        //random number

        Supplier<Integer> f5=()-> (int)(Math.random());


        Function<Integer, Integer> ff1=(a)->a*a;
        doSomeMath(ff1,10);
        print(ff1,10);


        Function<Integer, Integer> ff2=(a)->a*10;
        doSomeMath(ff2,24);

        Function<Integer, Integer> ff3=(a)->a%2==0? 1:-1;
        doSomeMath(ff3,56);

        Function<String,String> getString=Demo::getString;
        Function<String,String> getStringL=(s)->s;
        transformString(getString,"abc");
        transformString(Demo::getString,"abc");
        transformString(getStringL,"abc");
        transformString((s)->s,"abc");

        Function<Integer,Integer> fff3=Demo::getInt;

      //  Supplier<String> type = Person::type;

        Function<String, String> type = Person::type;

        Person p=new Person("Ivan");
        Supplier<String> getName =p::getName;

        System.out.println(getName.get());
       // Function<Person,Person> getName1 = Person::getName;
        //System.out.println(getName1.apply(p));

        Supplier<Person> person = Person::new;

    }

    public static int getInt(int a){
        return a%2==0? 1:-1;
    }

    public static String transformString(Function<String, String> f, String s){
        return f.apply(s);
    }


    public static int doSomeMath(Function<Integer,Integer> f,int a){
        System.out.println(a);
        return f.apply(a);
    }
   /* public static int doSomeMath1(int a){
        System.out.println(a);
        int i=a*10;
        return i;
    }
    public static int doSomeMath2(int a){
        return a%2==0? 1:-1;
    }
    */
       public static void print(Function<Integer,Integer> f,int a){
        System.out.println(doSomeMath( f, a));
    }





    public static String getString(String input){
        return input;
    }
}
