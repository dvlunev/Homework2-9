package transport;

public enum LoadCapacity {
    N1(0f,3.5f),
    N2(3.51f,12f),
    N3(12.1f,null);

    private float from;
    private Float before;

    LoadCapacity(float from, Float before) {
        this.from = from;
        this.before = before;
    }

    public float getFrom() {
        return from;
    }

    public void setFrom(float from) {
        this.from = from;
    }

    public Float getBefore() {
        return before;
    }

    public void setBefore(float before) {
        this.before = before;
    }

    @Override
    public String toString() {
        return ", Грузоподъемность: от " + from +
                " тонн до " + before +
                " тонн";
    }
}
