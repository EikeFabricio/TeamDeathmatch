package github.eike.fabricio.tdm.api.match.events;

import github.eike.fabricio.tdm.api.match.MatchStatus;
import github.eike.fabricio.tdm.api.match.events.model.MatchEvent;
import github.eike.fabricio.tdm.api.team.Team;
import github.eike.fabricio.tdm.api.team.TeamPlayer;

import java.util.List;

public class MatchEndingEvent extends MatchEvent {

    private List<Team> teams;
    private Team winner;
    private List<TeamPlayer> participants;
    private MatchStatus matchStatus;

    public MatchEndingEvent(List<Team> teams, Team winner, List<TeamPlayer> participants, MatchStatus matchStatus) {
        this.teams = teams;
        this.winner = winner;
        this.participants = participants;
        this.matchStatus = matchStatus;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public List<TeamPlayer> getParticipants() {
        return participants;
    }

    public void setParticipants(List<TeamPlayer> participants) {
        this.participants = participants;
    }

    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(MatchStatus matchStatus) {
        this.matchStatus = matchStatus;
    }
}
