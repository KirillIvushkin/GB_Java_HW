package Lesson02;
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера
 необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
*/
public class HW_02 {

    public static void main(String[] args) {

        String[][] stringArray = {
                {"a","2","3","4"},
                {"1","2","3","4"},
//                {"1","s","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                //{"1","2","3","4"}
        };

        try {
            System.out.println(SumIntArray(stringArray));
        } catch (Exception e){};

    }


    public static class MyArraySizeException extends Exception {


    }
    public static class MyArrayDataException extends Exception {

    }

    public static int SumIntArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int result = 0;

        if (array.length != 4 || array[0].length != 4) {
            System.out.println("Размер массива не 4х4");
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    System.out.println("Ячейка [" + i + ", " + j + "] содержит значение: " + array[i][j]);
                    throw new MyArrayDataException();
                }
            }
        }
        return result;
    }

}
