package github.eike.fabricio.tdm.api.match.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerDamageEvent extends Event implements Cancellable {

    private boolean cancelled;
    private static HandlerList handlerList = new HandlerList();

    private Entity damager;
    private Player victim;
    private double damage;

    public PlayerDamageEvent(Player victim, Entity damager, double damage) {
        this.victim = victim;
        this.damager = damager;
        this.damage = damage;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public Entity getDamager() {
        return damager;
    }

    public void setKiller(Entity damager) {
        this.damager = damager;
    }

    public Player getVictim() {
        return victim;
    }

    public void setVictim(Player victim) {
        this.victim = victim;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
