package github.eike.fabricio.tdm.api.match.events.model;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class MatchEvent extends Event implements Cancellable {

    private boolean cancelled;
    private HandlerList handlerList = new HandlerList();

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public HandlerList getHandlers() {
        return handlerList;
    }

}
