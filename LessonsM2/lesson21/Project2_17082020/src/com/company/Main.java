package com.company;

import com.company.action.Action;
import com.company.action.ToUpperCaseAction;
import com.company.condition.LengthCondition;

public class Main {

    public static void main(String[] args) {

        String[] strings={"12","qwerty","123456","14",""};
    /*    StringArrayHandler stringArrayHandler=
                new StringArrayHandler(strings,
                        new ReverseStringAction(),
                        new LengthMoreThanFourCondition());
       // Condition condition=new LengthMoreThanFourCondition();
        //Action action=new ReverseStringAction();
        //stringArrayHandler.stringsHandle(action,condition);
        stringArrayHandler.stringsHandle();
        System.out.println(stringArrayHandler.toString());*/

        System.out.println("----------------------------");

      /*  StringArrayHandler stringArrayHandler2=
                new StringArrayHandler(strings,
                        new ReverseStringAction(),
                        new LengthCondition(1));
        stringArrayHandler2.stringsHandle();
        System.out.println(stringArrayHandler2.toString());*/

        System.out.println("----------------------------");

        StringArrayHandler stringArrayHandler3=
                new StringArrayHandler(strings,
                        new ToUpperCaseAction(),
                        new LengthCondition(1));
        stringArrayHandler3.stringsHandle();
        System.out.println(stringArrayHandler3.toString());

     /*   StringArrayHandler stringArrayHandler4=
                new StringArrayHandler(strings,
                        null,
                        new LengthCondition(1));
        stringArrayHandler4.stringsHandle();
        System.out.println(stringArrayHandler4.toString());*/
      /*  StringArrayHandler stringArrayHandler4=
                new StringArrayHandler(strings,
                       new ReverseStringAction(),
                       null);
        stringArrayHandler4.stringsHandle();
        System.out.println(stringArrayHandler4.toString());*/


        ActionAndConditionExample actAndCond=new ActionAndConditionExample();
        StringArrayHandler stringArrayHandler5=
                new StringArrayHandler(strings,
                        actAndCond,
                        actAndCond);
        stringArrayHandler5.stringsHandle();
        System.out.println(stringArrayHandler5.toString());




    }
}

//task: there is some array.
//write
//etirw
/*
1. перебрать массив
2. выбрать нужные (условие)
3. реверс (действие)
 */
