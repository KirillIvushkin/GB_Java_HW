package Lesson03;
import java.util.ArrayList;


public class Box <T extends Fruit> {

    ArrayList<T> fruits;

    public Box() { //Создадим пустую коробку
        fruits = new ArrayList<>();

    }

//    public Box(T fruit1, T fruit2, T fruit3) { //В коробку помещается только 3 фрукта
//        fruits = new ArrayList<>();
//        fruits.add(fruit1);
//        fruits.add(fruit2);
//        fruits.add(fruit3);
//    }

    public boolean compare(Box<?> anotherBox) { //Сравним вес коробок, если равны вернем - true
        return this.getWeightBox() == anotherBox.getWeightBox();

    }

    public float getWeightBox() {

        if (fruits.size() != 0) {
            return fruits.get(0).getWeight() * fruits.size();
        } else {
            System.out.println("Коробка пустая");
            return 0;
        }

    }

    public void addFruitToBox(T fruit) {
        fruits.add(fruit);
    }


}
