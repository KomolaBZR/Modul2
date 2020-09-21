package com.company;

public class Main {

    public static void main(String[] args) {
        String[] bankData = new String[] {":Til Schweiger DE15971891",
                "AG: Microsoft DE15978765", "GmbH: Pupkin SoftLab DE15954356",
                "e.V.:PupkinSoftLab Iban:DE15954356"};

    }
}

/*
Дан массив строк-клиентов банка следующего вида:
:Til Schweiger Iban:DE15971891
AG:Macrosoft Iban:DE15978765
GmbH:Pupkin SoftLab Iban:DE15954356
e.V.:PupkinSoftLab Iban:DE15954356
т.е. форма собственности: Имя\Название Iban:счет.
Если форма собственности не указана, клиент – физ.лицо.
Необходимо создать класс для описания физ.лиц,
с полями для имени и фамилии, и класс (или классы?) для описания юр.лиц..
Для каждой строки исходного массива необходимо получить
соответствующий Account с полями (owner, iban).
Распечатать массив Account.
Tipps:
"".toCharArray
 */
