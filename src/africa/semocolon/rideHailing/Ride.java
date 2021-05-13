package africa.semocolon.rideHailing;

public class Ride {
    private String currentLocation;
    private String destination;
    private String driverName;
    private int date;
    private String pickUpTime;
    private String dropOffTime;

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCurrentLocation(){
        return currentLocation;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDestination(){
        return destination;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setDropOffTime(String dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public String getDropOffTime(){
        return dropOffTime;
    }
}
