package github.eike.fabricio.tdm.api.match;

import github.eike.fabricio.tdm.api.match.events.MatchDeleteEvent;
import github.eike.fabricio.tdm.api.team.Team;
import org.bukkit.Bukkit;

import java.util.List;

public class Match {

    private List<Team> teams;
    private int killLimit;
    private MatchStatus status;

    public Match(List<Team> teams, int killLimit, MatchStatus status) {
        this.teams = teams;
        this.killLimit = killLimit;
        this.status = status;
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

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public void delete() {
        MatchAdmin.getInstance().getMatches().remove(this);
        this.setStatus(MatchStatus.NONE);

        MatchDeleteEvent event = new MatchDeleteEvent(this);
        Bukkit.getServer().getPluginManager().callEvent(event);
    }
}
