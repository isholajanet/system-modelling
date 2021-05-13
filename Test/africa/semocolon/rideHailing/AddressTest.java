package africa.semocolon.rideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressTest {
    @Test
    public void testThatSystemCanAcceptHouseNumber(){
        Address myAddress = new Address();
        myAddress.setHouseNumber(312);
        assertEquals(312, myAddress.getHouseNumber());
    }
    @Test
    public void testThatSystemCanAcceptStreetName(){
        Address myAddress = new Address();
        myAddress.setStreetName("Herbert Macaulay");
        assertEquals("Herbert Macaulay", myAddress.getStreetName());
    }
    @Test
    public void testThatSystemCanAcceptCity(){
        Address myAddress = new Address();
        myAddress.setCity("Yaba");
        assertEquals("Yaba", myAddress.getCity());
    }
    @Test
    public void testThatSystemCanAcceptState(){
        Address myAddress = new Address();
        myAddress.setState("Lagos");
        assertEquals("Lagos", myAddress.getState());
    }
}
