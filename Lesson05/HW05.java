package Lesson05;


import java.io.*;

public class HW05 {
    /*

    1. Реализовать сохранение данных в csv файл;
2. Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура csv файла:
| Строка заголовок с набором столбцов |
| Набор строк с целочисленными значениями |
| * Разделитель между столбцами - символ точка с запятой (;) |

Пример:
Value 1;Value 2;Value 3
100;200;123
300,400,500
Для хранения данных использовать класс вида:
public class AppData {
  private String[] header;
  private int[][] data;

 // ...
}
Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
     */

    public static class AppData implements Serializable{
        private String[] header;
        private int[][] data;

        public void setHeader(String[] header) {
            this.header = header;
        }

        public void setData(int[][] data) {
            this.data = data;
        }

        public String[] getHeader() {
            return header;
        }

        public int[][] getData() {
            return data;
        }

        public void printAppData(){
            for (int i = 0; i < getHeader().length; i++) {
                System.out.print(getHeader()[i] + " \t");
            }
            System.out.println();
            for (int i = 0; i < getData()[0].length ; i++) {
                for (int j = 0; j < getData()[i].length; j++) {
                    System.out.print(getData()[i][j] + " \t");
                }
                System.out.println();
            }
        }

    }

    public static void save(AppData data, File file){

//        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("AppData.ser"))) {
            objOut.writeObject(data);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws IOException {

        File file = new File("file.csv");
        byte[] buff = new byte[1000];
        int[][] arrayData = new int[3][3];
        AppData appData = new AppData();


        try(BufferedReader  reader = new BufferedReader(new FileReader(file))) {

            String[] header = reader.readLine().split(";");  //читаем заголовок
            appData.setHeader(header);
            String dataLine;
            int row = 0;
            while ((dataLine = reader.readLine()) != null) {
                String[] InArray = dataLine.split(";");
                for (int x = 0; x < InArray.length; x++){
                    arrayData[row][x] = Integer.parseInt(InArray[x]);
                                    }
                row++;
            }
            appData.setData(arrayData);

        } catch (IOException e){
             e.printStackTrace();

        }
//        System.out.println("Программа еще работает");

        appData.printAppData();
        save(appData, file);

    }
}
