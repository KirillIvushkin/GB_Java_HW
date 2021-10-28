package Lesson03;
/*
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку
         нельзя сложить и яблоки, и апельсины;
        Для хранения фруктов внутри коробки можно использовать ArrayList;
        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f,
        апельсина – 1.5f (единицы измерения не важны);
        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare()
        в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке
        фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        Не забываем про метод добавления фрукта в коробку.
*/

public class HW_03 {

    public static void main(String[] args) {

        int countApples = 4;
        int countOranges= 5;

        Box<Apple> boxOneForApples = new Box<>(); //Создадим 1ю пустую коробку для яблок
        Box<Orange> boxTwoForOranges = new Box<>(); //Создадим 2ю пустую коробку для апельсинов
        Box<Apple> boxEmptyForApples = new Box<Apple>(); //Создадим 3ю пустую коробку для яблок

        //в 1ю коробку положим countApples яблок
        for (int i = 0; i < countApples; i++) boxOneForApples.addFruitToBox(new Apple());

        //во 2ю коробку положим countOranges яблок
        for (int i = 0; i < countOranges; i++) boxTwoForOranges.addFruitToBox(new Orange());

        System.out.println("Вес коробок одинаковый? : " + boxOneForApples.compare(boxTwoForOranges));
    }



}
