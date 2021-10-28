package Lesson01.WorkerClasses;

public class Results {
    private boolean[][] results;

    private static int teamCount;
    private static int CountCourses;

    public Results(Team team, Course course){
        teamCount = team.getTeamCount();
        CountCourses = course.getCountCourses();
        this.results = new boolean[teamCount][CountCourses];
        clearResults();
    }

    public void clearResults(){
        for (int i = 0; i < teamCount ; i++) {
            for (int j = 0; j < CountCourses; j++) {
                results[i][j] = false;
            }
        }
    }
    public void showResults(Team team) {


        for (int i = 0; i < teamCount; i++) {
            System.out.print(team.getWorker(i + 1).getName() + "\t");
            for (int j = 0; j < CountCourses; j++) {
                if (results[i][j]) {
                    System.out.print("прошел    " + "\t");
                } else System.out.print("не прошел " + "\t");

            }
            System.out.println();
        }
        System.out.println("Количество участников в команде: " + teamCount);
        System.out.println("Количество препятствий: " + CountCourses);
    }

    public void setResults(int i, int j, boolean result) {
        results[i][j] = result;
    }
}
