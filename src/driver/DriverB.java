package driver;

import transport.Car;
import transport.StringUtils;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName,
                   boolean driverLicense,
                   int experience,
                   String typeOfLicense) throws IllegalArgumentException {
        super(fullName, driverLicense, experience, typeOfLicense);
    }

    @Override
    public void startMove(Car transport) {
        if (isDriverLicense()) {
            transport.startMove();
        }
    }

    @Override
    public void finishMove(Car transport) {
        if (isDriverLicense()) {
            transport.finishMove();
        }
    }

    @Override
    public void refill(Car transport) {
        if (isDriverLicense()) {
            transport.refill();
        }
    }

    @Override
    public void setTypeOfLicense(String typeOfLicense) throws IllegalArgumentException {
        if (StringUtils.isNullOrEmptyOrBlank(typeOfLicense) || !typeOfLicense.equals("B") || !isDriverLicense()) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        super.setTypeOfLicense(typeOfLicense);
    }
}
