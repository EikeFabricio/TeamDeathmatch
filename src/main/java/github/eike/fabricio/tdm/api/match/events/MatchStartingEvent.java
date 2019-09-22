package github.eike.fabricio.tdm.api.match.events;

import github.eike.fabricio.tdm.api.match.MatchStatus;
import github.eike.fabricio.tdm.api.match.events.model.MatchEvent;
import github.eike.fabricio.tdm.api.team.Team;

import java.util.List;

public class MatchStartingEvent extends MatchEvent {

    private List<Team> teams;
    private int maxKills;
    private MatchStatus matchStatus;

    public MatchStartingEvent(List<Team> teams, int maxKills, MatchStatus matchStatus) {
        this.teams = teams;
        this.maxKills = maxKills;
        this.matchStatus = matchStatus;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public int getMaxKills() {
        return maxKills;
    }

    public void setMaxKills(int maxKills) {
        this.maxKills = maxKills;
    }

    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(MatchStatus matchStatus) {
        this.matchStatus = matchStatus;
    }
}
