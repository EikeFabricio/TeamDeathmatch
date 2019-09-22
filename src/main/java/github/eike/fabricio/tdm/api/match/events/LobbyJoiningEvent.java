package github.eike.fabricio.tdm.api.match.events;

import github.eike.fabricio.tdm.api.match.events.model.MatchEvent;
import github.eike.fabricio.tdm.api.team.Team;
import github.eike.fabricio.tdm.api.team.TeamPlayer;

import java.util.List;

public class LobbyJoiningEvent extends MatchEvent {

    private List<Team> teams;
    private TeamPlayer player;

    public LobbyJoiningEvent(List<Team> teams, TeamPlayer teamPlayer) {
        this.teams = teams;
        this.player = teamPlayer;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public TeamPlayer getPlayer() {
        return player;
    }

    public void setPlayer(TeamPlayer player) {
        this.player = player;
    }
}
