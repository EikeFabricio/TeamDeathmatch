package github.eike.fabricio.tdm.events;

import github.eike.fabricio.tdm.api.match.MatchAdmin;
import github.eike.fabricio.tdm.api.match.events.PlayerDamageEvent;
import github.eike.fabricio.tdm.api.match.events.TeamPlayerDeathEvent;
import github.eike.fabricio.tdm.api.team.TeamPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TeamPlayerDamageEvent implements Listener {

    @EventHandler
    void onDamage(PlayerDamageEvent e) {
        if (e.getDamager().getType() == EntityType.PLAYER) {
            MatchAdmin matchAdmin = MatchAdmin.getInstance();

            TeamPlayer damager = matchAdmin.getTeamPlayer((Player) e.getDamager());
            TeamPlayer victim = matchAdmin.getTeamPlayer(e.getVictim());

            if (damager.getTeam() == victim.getTeam() || e.isCancelled()) {
                e.setCancelled(true);
            } else {
                if (e.getDamage() > victim.getHealth()) {
                    TeamPlayerDeathEvent event = new TeamPlayerDeathEvent(damager, victim);
                    Bukkit.getServer().getPluginManager().callEvent(event);

                    victim.setHealth(0.0);

                    if (damager.isFullyHealth()) damager.setMaxHealth(damager.getHealth() + 0.5);
                    else damager.setHealth(damager.getMaxHealth());
                } else {
                    victim.setHealth(victim.getHealth() - e.getDamage());
                }
            }
        }
    }
}
