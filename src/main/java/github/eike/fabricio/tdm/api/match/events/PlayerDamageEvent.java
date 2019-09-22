package github.eike.fabricio.tdm.api.match.events;

import github.eike.fabricio.tdm.api.team.TeamPlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerDamageEvent extends Event implements Cancellable {

    private boolean cancelled;
    private HandlerList handlerList = new HandlerList();
    private TeamPlayer damager;
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

    public TeamPlayer getDamager() {
        return damager;
    }

    public void setKiller(TeamPlayer damager) {
        this.damager = damager;
    }

    public TeamPlayer getVictim() {
        return victim;
    }

    public void setVictim(TeamPlayer victim) {
        this.victim = victim;
    }
}
