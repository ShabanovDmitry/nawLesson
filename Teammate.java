package newLesson;

public class Teammate {
    String name;
    double endurance;

    public Teammate(String name, float endurance) {
        this.name = name;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public double getCanRun() {
        return endurance;
    }
}
