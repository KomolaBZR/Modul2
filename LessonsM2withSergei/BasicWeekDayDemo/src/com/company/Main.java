package com.company;

public class Main {

    public static void main(String[] args) {

    }

   /* public static boolean sleepIn(boolean weekday, boolean vacation){
       if ((weekday==false)||(vacation==true)){
            return true;
        } else {
            return false;
        }
    }*/

    public static boolean sleepIn(boolean weekday, boolean vacation){

        return !weekday||vacation;
    }

}
