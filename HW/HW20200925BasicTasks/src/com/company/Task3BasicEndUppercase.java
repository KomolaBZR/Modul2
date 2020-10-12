package com.company;


public class Task3BasicEndUppercase {

    // Дана строка, вернуть новую строку, где последние 3 символа
    // в верхнем регистре (заглавные). Если строка длины меньше 3,
    // перевести это в заглавные.
    //endUp("Hello") → "HeLLO"
    // endUp("hi there") → "hi thERE"
    // endUp("hi") → "HI"
    //Написать код функции: public String endUp(String str) { }



        public static String endUp(String str) {
            if ((str.length() - 3) > 0){
                return str.substring(0, str.length() - 3).concat(str.substring(str.length() - 3).toUpperCase());
            }
            return str.toUpperCase();
        }
    }
