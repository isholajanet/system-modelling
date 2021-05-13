package africa.semocolon.rideHailing;

public class Driver {
    private String driverName;
    private String carType;
    private String plateNumber;
    private String carColour;

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setCarColour(String colour) {
        this.carColour = colour;
    }

    public String getCarColour() {
        return carColour;
    }
}
