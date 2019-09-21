package github.eike.fabricio.tdm.api.match;

import java.util.ArrayList;
import java.util.List;

public class MatchAdmin {

    private static final MatchAdmin instance = new MatchAdmin();

    private List<Match> matches;
    private List<MatchRunnable> matchesRunnable;

    private MatchAdmin() {
        this.setMatches(new ArrayList<Match>());
        this.setMatchRunnables(new ArrayList<MatchRunnable>());
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

    public List<MatchRunnable> getMatchRunnable() {
        return matchesRunnable;
    }

    public void setMatchRunnables(List<MatchRunnable> matchesRunnable) {
        this.matchesRunnable = matchesRunnable;
    }

    public void start() throws Exception {
        for (MatchRunnable runnable : matchesRunnable) {
            runnable.start();
        }
    }
}
