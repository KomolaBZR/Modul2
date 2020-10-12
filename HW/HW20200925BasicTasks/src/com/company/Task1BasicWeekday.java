package com.company;

public class Task1BasicWeekday {


    public static void main(String[] args) {

    }

    //Параметр weekday имеет значение true если это рабочий день недели,
    // и параметр vacation имеет значение true если у нас каникулы.
    // Мы спим, если это не рабочий день или у нас каникулы.
    // Вернуть значение true, когда мы спим. Например:
    //sleepIn(false, false) → true
    // sleepIn(true, false) → false
    // sleepIn(false, true) → true
    //Написать код функции:
    //public boolean sleepIn(boolean weekday, boolean vacation) { }

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
