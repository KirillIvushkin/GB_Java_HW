package Lesson04;
/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать, сколько раз встречается каждое слово.

2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
        искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
        (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
*/

import java.util.*;


public class HW04 {

    public static void main(String[] args) {

        String[] words = {
                "один",
                "два",
                "три",
                "один",
                "два",
                "четыре",
                "пять",
                "десять",
                "два",
                "четыре",
                "пять",
                "три",
                "семь",
                "семь", "три", "ноль", "ноль", "ноль", "ноль", "пять", "ноль", "три", "семь"
        };
//      Задание №1
        HashMap<String, Integer> unicWords = new HashMap<>();

        for (String word : words){
            if (!unicWords.containsKey(word)){
                unicWords.put(word, 1);
            } else {
                unicWords.put (word, unicWords.get(word) + 1);
            }
        }

        for (Map.Entry<String, Integer> elem: unicWords.entrySet()){
            System.out.println(elem.getKey() + " \t" + elem.getValue());
        }

        //Задание №2
        PhoneBook pb = new PhoneBook();
        pb.add("Иванов Иван", "111");
        pb.add("Петров Петр", "222");
        pb.add("Сидоров Николай", "333");
        pb.add("Михайлов Евгений", "777");
        pb.add("Михайлов Евгений", "555");
        pb.add("Иванов Иван", "123");


        pb.PrintPhonebook();

        System.out.println();

        String surname = "Михайлов Евгений";

        System.out.println("Найдем все телефоны по ФИО: " + surname);

        String[] numbers = pb.FindNumberPhone(surname); //Поиск по фамилии
        for (String number : numbers) { //Вывод на печать всех телефонов
            System.out.println(number);
        }
    }


}
