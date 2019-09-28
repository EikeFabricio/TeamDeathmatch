package github.eike.fabricio.tdm.api.match;

import github.eike.fabricio.tdm.api.team.Team;
import github.eike.fabricio.tdm.api.team.TeamPlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MatchAdmin {

    private static final MatchAdmin instance = new MatchAdmin();

    private List<Match> matches;
    private Map<Player, Team> playerTeams;

    private MatchAdmin() {
        this.setMatches(new ArrayList<Match>());
    }

    public static MatchAdmin getInstance() {
        return instance;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public TeamPlayer getTeamPlayer(Player player) {
        TeamPlayer playerToReturn = (TeamPlayer) player;

        playerToReturn.setTeam(playerTeams.get(player));

        return playerToReturn;
    }

}
