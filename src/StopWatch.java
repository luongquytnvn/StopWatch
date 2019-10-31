import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void Start() {
        this.startTime = new Date();
    }

    public void End() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        Date endtime = this.getEndTime();
        Date starttime = this.getStartTime();
        return endtime.getTime() - starttime.getTime();
    }
}
