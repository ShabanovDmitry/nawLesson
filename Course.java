package newLesson;

public class Course {
    private final int[] course = {100, 100, 100, 100};

    public void doIt(Team team) {
        System.out.println("Название команды: " + team.getTeamName());
        double result = 0;
        for (int i = 0; i < course.length; i++) {
            for (int j = 0; j < team.getTeam().length; j++) {
                result = course[i]/team.getTeam()[i].getCanRun();
            }
            if (result <= 1){
                System.out.println("Участник марафона " + team.getTeam()[i].getName() + " смог пройти дистаницию " + course[i] + " метров.");
            } else {
                System.out.println("Участник марафона " + team.getTeam()[i].getName() + " не смог пройти дистанцию " + course[i] + " метров.");
            }
        }

        for (int d = 0; d < team.getTeam().length; d++) {
            System.out.println("Выносливость участника " + team.getTeam()[d].getName() + " — " + team.getTeam()[d].getCanRun() + " метров.");
        }
    }

}
