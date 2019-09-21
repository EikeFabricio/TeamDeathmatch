package github.eike.fabricio.tdm.api.team;

import github.eike.fabricio.tdm.api.team.Team;
import org.bukkit.entity.Player;

public abstract class TeamPlayer implements Player {

    private int kills;
    private Team team;

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }
}
