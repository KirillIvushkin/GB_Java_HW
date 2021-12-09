package Lesson04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
        искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
        (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
*/
public class PhoneBook {
    private static HashMap<String, String> pb = new HashMap<>();


    static void add(String name, String phone) {
        pb.put(phone, name);
    }

    public static String[] FindNumberPhone(String surname){
            List<String> result = new ArrayList<>();
            for (Map.Entry entry : pb.entrySet()) {
                if (surname.equals(entry.getValue())){
                    result.add((String) entry.getKey());
                }
            }
            if (result.size() == 0) result.add("Фамилия не найдена");
            return result.toArray(new String[0]);
        }

        public static void PrintPhonebook(){
            System.out.println("Телефонный справочник: ");
            for(Map.Entry<String,String> elem: pb.entrySet()){
                System.out.println(elem.getValue()+": "+ elem.getKey());
            }
        }
}
