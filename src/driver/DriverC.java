package driver;

import transport.StringUtils;
import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName,
                   boolean driverLicense,
                   int experience,
                   String typeOfLicense) throws IllegalArgumentException {
        super(fullName, driverLicense, experience, typeOfLicense);
    }

    @Override
    public void startMove(Truck transport) {
        if (isDriverLicense()) {
            transport.startMove();
        }
    }

    @Override
    public void finishMove(Truck transport) {
        if (isDriverLicense()) {
            transport.finishMove();
        }
    }

    @Override
    public void refill(Truck transport) {
        if (isDriverLicense()) {
            transport.refill();
        }
    }

    @Override
    public void setTypeOfLicense(String typeOfLicense) throws IllegalArgumentException {
        if (StringUtils.isNullOrEmptyOrBlank(typeOfLicense) || !typeOfLicense.equals("C") || !isDriverLicense()) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        super.setTypeOfLicense(typeOfLicense);
    }
}
