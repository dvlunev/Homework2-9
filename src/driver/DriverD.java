package driver;

import transport.Bus;
import transport.StringUtils;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName,
                   boolean driverLicense,
                   int experience,
                   String typeOfLicense) throws IllegalArgumentException {
        super(fullName, driverLicense, experience, typeOfLicense);
    }

    @Override
    public void startMove(Bus transport) {
        if (isDriverLicense()) {
            transport.startMove();
        }
    }

    @Override
    public void finishMove(Bus transport) {
        if (isDriverLicense()) {
            if (isDriverLicense()) {
                transport.finishMove();
            }
        }
    }

    @Override
    public void refill(Bus transport) {
        if (isDriverLicense()) {
            transport.refill();
        }
    }

    @Override
    public void setTypeOfLicense(String typeOfLicense) throws IllegalArgumentException {
        if (StringUtils.isNullOrEmptyOrBlank(typeOfLicense) || !typeOfLicense.equals("D") || !isDriverLicense()) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        super.setTypeOfLicense(typeOfLicense);
    }
}
