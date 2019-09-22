package github.eike.fabricio.tdm.api.match;

import org.bukkit.scheduler.BukkitRunnable;

import java.util.Date;

class MatchRunnable extends BukkitRunnable {

    private Match match;
    private Date startDate, finalDate;

    public MatchRunnable(Match match, Date startDate, Date finalDate) {
        this.match = match;
        this.startDate = startDate;
        this.finalDate = finalDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public void run() {

    }

    @Override
    public synchronized void cancel() throws IllegalStateException {

    }

}
