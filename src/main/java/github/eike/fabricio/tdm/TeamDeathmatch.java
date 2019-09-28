package github.eike.fabricio.tdm;

import github.eike.fabricio.tdm.events.TeamPlayerDamageEvent;
import github.eike.fabricio.tdm.events.call.CallPlayerDamageEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Eike Fabricio da Silva
 */
public class TeamDeathmatch extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = getServer().getPluginManager();

        pluginManager.registerEvents(new TeamPlayerDamageEvent(), this);
        pluginManager.registerEvents(new CallPlayerDamageEvent(), this);
    }

    @Override
    public void onDisable() {

    }

}
