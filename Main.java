package newLesson;

public class Main {
    public static void main(String[] args) {
        Teammate[] leader = new Teammate[4];
        leader[0] = new Teammate("Евгений", 100);
        leader[1] = new Teammate("Григорий", 120);
        leader[2] = new Teammate("Михаил", 96);
        leader[3] = new Teammate("Фёдор", 118);

        Team team = new Team(leader, "Победа");

        Course cross = new Course();
        cross.doIt(team);
    }
}