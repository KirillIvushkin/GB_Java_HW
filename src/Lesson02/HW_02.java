package Lesson02;
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета.
*/
public class HW_02 {

    public static String[][] stringArray = {
        {"1", "1", "2", "s"},
        {"1", "a", "2", "2"},
        {"1", "2", "b", "s"},
        {"c", "d", "3", "s"}
    };

    public static void printStringArray(String[][] stringArray) { // метод, на вход которого подаётся двумерный строковый массив размером 4х4.
        //Вывод двумерного массива на экран
        for (String[] s:stringArray){
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i]+"\t");
                }
            System.out.println();
            }
    }
    public static void printElementStringArray(String[][] stringArray,int x, int y) {//Вывод в консоль одного элемента массива с координатами x и y
        System.out.println(stringArray[x-1][y-1]);
    }

    public static void main(String[] args) {
        System.out.println("ДЗ-02");
        try {
            printElementStringArray(stringArray,2,2); //Вывод "а"
            printElementStringArray(stringArray,1,5); //Ошибка - Вывод исключения


        } catch (ArithmeticException e) {
            System.out.println("Дeлeниe на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индексации массива: " + e);
        }
        System.out.println("Пocлe блока операторов try/catch");

        printStringArray(stringArray);
    }

}

