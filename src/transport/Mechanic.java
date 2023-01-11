package transport;

import java.util.Objects;

public class Mechanic<T extends Transport> {

    private String name;
    private String company;
    public enum Skills {
        CAR("легковой"),
        BUS("автобус"),
        TRUCK("грузовки"),
        ANY("любой");

        Skills(String type) {
        }
    }

    private Skills skill;

    public Mechanic(String name, String company, Skills skill) {
        this.name = name;
        this.company = company;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



    public boolean carryOutMaintenance(T t) throws NotDiagnosticException {
        return t.passDiagnostics();
    }

    public void fixCar(T t) {
        System.out.println("Проведен ремонт транспортного средства " + t.getBrand());
    }

    @Override
    public String toString() {
        return name +
                ", компания " + company +
                ", может работать с " + skill.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
