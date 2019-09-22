package github.eike.fabricio.tdm.api.match.events;

import github.eike.fabricio.tdm.api.team.TeamPlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TeamPlayerKillEvent extends Event implements Cancellable {

    private boolean cancelled;
    private HandlerList handlerList = new HandlerList();
    private TeamPlayer killer;
    private TeamPlayer victim;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    public HandlerList getHandlers() {
        return handlerList;
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
