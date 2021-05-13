package africa.semocolon.rideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class passengerTest {
    @Test
    public void testThatSystemCanAcceptPassengerFirstName(){
        Passenger myPassenger = new Passenger();
        myPassenger.setPassengerFirstName("Janet");
        assertEquals("Janet", myPassenger.getPassengerFirstName());
    }
    @Test
    public void testThatSystemCanAcceptPassengerLastName(){
        Passenger myPassenger = new Passenger();
        myPassenger.setPassengerLastName("Ishola");
        assertEquals("Ishola", myPassenger.getPassengerLastName());
    }
    @Test
    public void testThatSystemCanAcceptEmailAddress(){
        Passenger myPassenger = new Passenger();
        myPassenger.setPassengerEmailAddress("janetishola2010@gmail.com");
        assertEquals("janetishola2010@gmail.com", myPassenger.getPassengerEmailAddress());
    }
    @Test
    public void testThatSystemCanAcceptPhoneNumber(){
        Passenger myPassenger = new Passenger();
        myPassenger.setPassengerPhoneNumber("08023456760");
        assertEquals("08023456760", myPassenger.getPassengerPhoneNumber());
    }
}
