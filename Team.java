package newLesson;

public class Team {
    String teamName;
    Teammate[] team;

    public Team(Teammate[] team, String teamName) {
        this.teamName = teamName;
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public Teammate[] getTeam() {
        return team;
    }
}
