package transport;

import java.util.Objects;

public class Sponsor {

    private String name;

    private int supportAmount;

    public Sponsor(String name, int supportAmount) {
        setName(name);
        setSupportAmount(supportAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.isNullOrEmptyOrBlank(name)) {
            name = "no name";
        }
        this.name = name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(int supportAmount) {
        if (supportAmount <= 0) {
            supportAmount = 100000;
        }
        this.supportAmount = supportAmount;
    }

    public void sponsorRace(Transport transport) {
        System.out.println("Спонсор " + name + " спонсировал заезд автомобилю " + transport.getBrand() + " на сумму " + supportAmount);
    }

    @Override
    public String toString() {
        return name +
                ", сумма поддержки " + supportAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
