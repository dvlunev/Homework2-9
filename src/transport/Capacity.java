package transport;

public enum Capacity {

    ESPECIALLY_SMALL(1,10),
    SMALL(11,25),
    MEDIUM(40,50),
    LARGE(60,80),
    EXTRA_LARGE(100,120);

    private int from;
    private int before;

    Capacity(int from, int before) {
        this.from = from;
        this.before = before;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public Integer getBefore() {
        return before;
    }

    public void setBefore(Integer before) {
        this.before = before;
    }
}
