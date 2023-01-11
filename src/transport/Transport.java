package transport;

import driver.Driver;

import java.util.*;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final double engineVolume;

    private static final Set<Driver<?>> DRIVERS = new HashSet<>();

    private final Set<Sponsor> sponsors = new HashSet<>();

    private final Set<Mechanic<?>> mechanics = new HashSet<>();

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        if (StringUtils.isNullOrEmptyOrBlank(brand)) {
            brand = "default";
        }
        this.brand = brand;
        if (StringUtils.isNullOrEmptyOrBlank(model)) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 2.0;
        }
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public static void addDriver(Driver<?> driver) {
        DRIVERS.add(driver);
    }

    public static void printDrivers() {
        System.out.println("Список водитилей: ");
        Iterator<Driver<?>> iterator = DRIVERS.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public abstract Driver<?> getDriver();

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refill();

    public abstract void printType();

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public boolean passDiagnostics() throws NotDiagnosticException {
        if (brand.equals("default") || model.equals("default")) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "\nТранспорт: Марка " + brand +
                ", Модель " + model +
                ", Обьем двигателя " + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
