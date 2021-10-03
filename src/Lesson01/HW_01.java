package Lesson01;
import Lesson01.WorkerClasses.Worker;
import Lesson01.WorkerClasses.Team;
import Lesson01.WorkerClasses.Course;
import Lesson01.WorkerClasses.Results;

//название команды;
//        массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//        метод для вывода информации о членах команды, прошедших дистанцию;
//        метод вывода информации обо всех членах команды.
//        3. Добавить класс Course (полоса препятствий), в котором будут находиться:
//        массив препятствий;
//        метод, который будет просить команду пройти всю полосу.

import Lesson01.WorkerClasses.Worker;

public class HW_01 {
    public static boolean CAN_SWIM, FEAR_OF_FIRE = true;
    public static boolean NO_SWIM, NO_FEAR_OF_FIRE = false;

    public static void main(String[] args) {
        System.out.println("ДЗ-01");


        Worker[] members = new Worker[]{
                new Worker("Слава", CAN_SWIM, FEAR_OF_FIRE),
                new Worker("Витя", NO_SWIM, NO_FEAR_OF_FIRE),
                new Worker("Коля", CAN_SWIM, NO_FEAR_OF_FIRE),
                new Worker("Ваня", CAN_SWIM, FEAR_OF_FIRE)
        };

        String[] courses = {"огонь", "вода", "медные трубы"};
    
        Course c = new Course(courses); // Создаем полосу препятствий
        Team team = new Team("Чемпионы", members); // Создаем команду
        Results results = new Results(team, c);
        c.doIt(team, results); // Просим команду пройти полосу

        System.out.println();
        System.out.print("Имя   "+"\t");
        for (int i = 0; i < c.getCountCourses(); i++) {
            System.out.print(c.getCourse(i)+"     \t");
        }
        System.out.println();
        results.showResults(team); // Показываем результаты

    }
}
