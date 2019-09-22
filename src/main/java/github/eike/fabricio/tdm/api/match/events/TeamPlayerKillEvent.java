package github.eike.fabricio.tdm.api.match.events;

import github.eike.fabricio.tdm.api.match.events.model.MatchEvent;
import github.eike.fabricio.tdm.api.team.TeamPlayer;

public class TeamPlayerKillEvent extends MatchEvent {

    private TeamPlayer killer;
    private TeamPlayer victim;

    public TeamPlayerKillEvent(TeamPlayer killer, TeamPlayer victim) {
        this.killer = killer;
        this.victim = victim;
    }

    public TeamPlayer getKiller() {
        return killer;
    }

    public void setKiller(TeamPlayer killer) {
        this.killer = killer;
    }

    public TeamPlayer getVictim() {
        return victim;
    }

    public void setVictim(TeamPlayer victim) {
        this.victim = victim;
    }

}
