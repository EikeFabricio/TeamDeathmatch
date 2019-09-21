package github.eike.fabricio.tdm.api.match;

import github.eike.fabricio.tdm.api.team.Team;

import java.util.List;

public class Match {

    private List<Team> teams;
    private int killLimit;

    public Match(List<Team> teams, int killLimit) {
        this.setTeams(teams);
        this.setKillLimit(killLimit);
    }


    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public int getKillLimit() {
        return killLimit;
    }

    public void setKillLimit(int killLimit) {
        this.killLimit = killLimit;
    }
}
