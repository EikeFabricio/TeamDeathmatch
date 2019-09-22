package github.eike.fabricio.tdm.api.match.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerDamageEvent extends Event implements Cancellable {

    private boolean cancelled;
    private HandlerList handlerList = new HandlerList();
    private Player damager;
    private Player victim;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    public HandlerList getHandlers() {
        return handlerList;
    }

    public Player getDamager() {
        return damager;
    }

    public void setKiller(Player damager) {
        this.damager = damager;
    }

    public Player getVictim() {
        return victim;
    }

    public void setVictim(Player victim) {
        this.victim = victim;
    }
}
