package github.eike.fabricio.tdm.api.team;

import org.bukkit.Location;

import java.util.List;

public final class Team {

    private List<TeamPlayer> teamPlayers;
    private TeamColor teamColor;
    private int kills;
    private Location spawnLoc;

    public Team(List<TeamPlayer> teamPlayers, TeamColor teamColor, int kills, Location spawnLoc) {
        this.teamPlayers = teamPlayers;
        this.teamColor = teamColor;
        this.kills = kills;
        this.spawnLoc = spawnLoc;
    }

    public List<TeamPlayer> getTeamPlayers() {
        return teamPlayers;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setTeamPlayers(List<TeamPlayer> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    public TeamColor getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(TeamColor teamColor) {
        this.teamColor = teamColor;
    }

    public int getKills() {
        return kills;
    }

    public Location getSpawnLoc() {
        return spawnLoc;
    }

    public void setSpawnLoc(Location spawnLoc) {
        this.spawnLoc = spawnLoc;
    }
}
