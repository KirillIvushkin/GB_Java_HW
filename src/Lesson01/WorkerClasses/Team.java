package Lesson01.WorkerClasses;

public class Team {
    private String name;
    private Worker[] workers;

    private static int teamCount;


    public Team(String name, Worker[] workers){
        this.name = name;
        this.workers = workers;
        this.teamCount = workers.length;
    }

    public int getTeamCount() {
        return teamCount;
    }

    public Worker getWorker(int number) { //Возвращает участника по номером number
        return workers[number-1];
    }

    public String getName() {
        return name;
    }
//    public void clearResults(int countCourses){
//        for (int i = 0; i < countCourses; i++) {
//            for (int j = 0; j < teamCount; j++) {
//                results[i][j] = false;
//            }
//        }
//    }
//    public void setResults(int numberCourses, int positionMember, boolean result){
//        results[positionMember][numberCourses] = result;
//    }
    public void showResults(){

    }
}
