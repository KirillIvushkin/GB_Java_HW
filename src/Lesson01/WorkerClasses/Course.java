package Lesson01.WorkerClasses;
public class Course {

    private static String[] courses;

    public Course(String[] courses) {
        this.courses = courses;
    }
    public void doIt(Team team, Results results){
//        team.clearResults(courses.length);
        System.out.println("проходим полосу препятствий");
        for (int j = 1; j <= team.getTeamCount(); j++){
            for (int i = 0; i < courses.length; i++) {
                results.setResults(j-1, i,getMemberTryCourse(team.getWorker(j),getCourse(i)));
                if (getMemberTryCourse(team.getWorker(j),getCourse(i))) {
                    System.out.println(team.getWorker(j).getName() + " проходит " + getCourse(i));
                }else System.out.println(team.getWorker(j).getName() + " не проходит " + getCourse(i));
            }
        }

    }
    public boolean getMemberTryCourse(Worker worker, String course){
        switch (course) {
            case "огонь":
                return !worker.getFearOfFire();

            case "вода":
                return !worker.getSwim();

            default:
                return true; //по умолчанию прошел

        }

    }

    public String getCourse(int number) {//Получаем название отдельного курса
        return courses[number];
    }
    public int getCountCourses(){
        return courses.length;
    }
    public void getAllCourses() {
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }
    }
}
