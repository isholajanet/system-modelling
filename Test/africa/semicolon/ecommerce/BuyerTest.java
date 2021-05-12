package africa.semicolon.ecommerce;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyerTest {

    @Test
    public void testThatSystemCanAcceptBuyerFirstName(){
        Buyer customer = new Buyer();
        customer.setBuyerFirstName("Janet");
        assertEquals("Janet", customer.getBuyerFirstName());

    }
    @Test
    public void testThatSystemCanAcceptBuyerLastName(){
        Buyer myCustomer = new Buyer();
        myCustomer.setBuyerLastName("Ishola");
        assertEquals("Ishola", myCustomer.getBuyerLastName());
    }
    @Test
    public void testThatSystemCanAcceptBuyerEmailAddress(){
        Buyer myCustomer = new Buyer();
        myCustomer.setBuyerEmailAddress("janetishola2010@gmail.com");
        assertEquals("janetishola2010@gmail.com", myCustomer.getCustomerEmailAddress());

    }
    @Test
    public void testThatSystemCanAcceptPhoneNumber() {
        Buyer myCustomer = new Buyer();
        myCustomer.setBuyerPhoneNumber("08023456789");
        assertEquals("08023456789", myCustomer.getBuyerPhoneNumber());
    }
    @Test
    public void testThatSystemCanAcceptAddress(){
        Buyer myCustomer = new Buyer();
        myCustomer.setAddress("312, Herbert Macaulay, Sabo-Yaba");
        assertEquals("312, Herbert Macaulay, Sabo-Yaba", myCustomer.getBuyerAddress());
    }
    @Test
    public void testThatSystemCanAcceptPassword(){
        Buyer myCustomer = new Buyer();
        myCustomer.setPassword("2355");
        assertEquals("2355", myCustomer.getPassWord());

    }
}
