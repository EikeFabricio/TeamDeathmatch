package github.eike.fabricio.tdm.events.call;

import github.eike.fabricio.tdm.api.match.events.PlayerDamageEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class CallPlayerDamageEvent implements Listener {

    @EventHandler
    void onEntity(EntityDamageByEntityEvent e) {
        if (e.getEntity() != null) {
            if (e.getEntityType() != null) {
                if (e.getEntityType() == EntityType.PLAYER) {
                    PlayerDamageEvent event = new PlayerDamageEvent((Player) e.getEntity(), e.getDamager(), e.getDamage());
                    Bukkit.getServer().getPluginManager().callEvent(event);

                    e.setCancelled(true);
                }
            }
        }
    }
}
