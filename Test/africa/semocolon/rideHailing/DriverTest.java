package africa.semocolon.rideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DriverTest {
    @Test
    public void testThatSystemCanAcceptDriverName(){
        Driver myDriver = new Driver();
        myDriver.setDriverName("John Kelechi");
        assertEquals("John Kelechi", myDriver.getDriverName());
    }
    @Test
    public void testThatSystemCanAcceptCarType(){
        Driver myDriver = new Driver();
        myDriver.setCarType("Toyota");
        assertEquals("Toyota", myDriver.getCarType());
    }
    @Test
    public void testThatSystemCanAcceptPlateNumber(){
        Driver myDriver = new Driver();
        myDriver.setPlateNumber("KJV_013_345");
        assertEquals("KJV_013_345", myDriver.getPlateNumber());
    }
    @Test
    public void testThatSystemCanAcceptCarColour(){
        Driver myDriver = new Driver();
        myDriver.setCarColour("White");
        assertEquals("White", myDriver.getCarColour());
    }
}
