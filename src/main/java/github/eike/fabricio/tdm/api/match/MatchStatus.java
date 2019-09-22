package github.eike.fabricio.tdm.api.match;

public enum MatchStatus {

    WAITING(0), STARTED(1), ENDED(2), NONE(3);

    private int value;

    MatchStatus(int value) {
        this.value = value;
    }

    public MatchStatus getStatusByValue(int value) {
        switch (value) {
            case 0:
                return WAITING;
            case 1:
                return STARTED;
            case 2:
                return ENDED;
            case 3:
            default:
                return NONE;
        }
    }
}
