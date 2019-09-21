package github.eike.fabricio.tdm.api.match;

import github.eike.fabricio.tdm.api.team.Team;

import java.util.Date;
import java.util.List;

class MatchRunnable extends Thread {

    private List<Team> teams;
    private Date startDate, finalDate;
    private int killLimit;

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    @Override
    public void run() {

    }
}
