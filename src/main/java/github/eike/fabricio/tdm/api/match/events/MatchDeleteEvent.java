package github.eike.fabricio.tdm.api.match.events;

import github.eike.fabricio.tdm.api.match.Match;
import github.eike.fabricio.tdm.api.match.events.model.MatchEvent;

public class MatchDeleteEvent extends MatchEvent {

    private Match match;

    public MatchDeleteEvent(Match match) {
        this.match = match;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
