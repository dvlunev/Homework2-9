package transport;

import driver.Driver;
import driver.DriverC;

public class Truck extends Transport implements Competing {

    private LoadCapacity loadCapacity;
    private DriverC driverC;

    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        if (loadCapacity == null) {
            loadCapacity = LoadCapacity.N1;
        }
        this.loadCapacity = loadCapacity;
    }

    @Override
    public Driver<?> getDriver() {
        return driverC;
    }

    public void setDriverC(DriverC driverC) {
        this.driverC = driverC;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик " + getBrand() + " закончил движение");
    }

    public void refill() {
        System.out.println("Грузовик " + getBrand() + " заполнен топливом");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("У транспортного средства " + getBrand() +
                    " Грузоподъемность от " + loadCapacity.getFrom() + " тонн " +
            (loadCapacity.getBefore() != null ? "до " + loadCapacity.getBefore() + " тонн " : ""));
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль заехал на питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int) (Math.random() + 14);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() + 110);
    }

    @Override
    public String toString() {
        return super.toString() +
                (loadCapacity != null ? ", Грузоподъемность от " + loadCapacity.getFrom() + " тонн " +
                (loadCapacity.getBefore() != null ? "до " + loadCapacity.getBefore() + " тонн " : "") : " Нет данных") +
                ",\n Водитель " + driverC;
    }
}
