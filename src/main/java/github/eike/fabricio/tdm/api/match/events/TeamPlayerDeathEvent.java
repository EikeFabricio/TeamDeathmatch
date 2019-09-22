package github.eike.fabricio.tdm.api.match.events;

import github.eike.fabricio.tdm.api.match.events.model.MatchEvent;
import github.eike.fabricio.tdm.api.team.TeamPlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TeamPlayerDeathEvent extends MatchEvent {

    private TeamPlayer killer;
    private TeamPlayer victim;

    public TeamPlayerDeathEvent(TeamPlayer killer, TeamPlayer victim) {
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
