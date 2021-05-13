package africa.semocolon.rideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderTest {
    @Test
    public void testThatSystemCanAcceptCurrentLocation(){
        Ride myRide = new Ride();
        myRide.setCurrentLocation("312 Herbert Macaulay Sabo-Yaba");
        assertEquals("312 Herbert Macaulay Sabo-Yaba", myRide.getCurrentLocation());
    }
    @Test
    public void testThatSystemCanAcceptDestination(){
        Ride myRide = new Ride();
        myRide.setDestination("1 Osanyin Street Sabo-Yaba");
        assertEquals("1, Osanyin Street Sabo-Yaba", myRide.getDestination());
    }
    @Test
    public void testThatSystemCanAcceptDate(){
        Ride myRide = new Ride();
        myRide.setDate(11_11_11);
        assertEquals(11_11_11, myRide.getDate());

    }
    @Test
    public void testThatSystemCanAcceptPickUpTime(){
        Ride myRide = new Ride();
        myRide.setPickUpTime("10:00 am");
        assertEquals("10:00am", myRide.getPickUpTime());
    }
    @Test
    public void testThatSystemCanAcceptDropOffTime(){
        Ride myRide = new Ride();
        myRide.setDropOffTime("10:30am");
        assertEquals("10:30am", myRide.getDropOffTime());
    }
}
