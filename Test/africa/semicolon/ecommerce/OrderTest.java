package africa.semicolon.ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void testThatSystemCanAcceptOrderId(){
        Order customerOrder = new Order();
        customerOrder.setOrderId(001);
        assertEquals(001, customerOrder.getOrderId());

    }
    @Test
    public void testThatSystemCanAcceptDateOrdered(){
        Order customerOrder = new Order();
        customerOrder.setDateOrdered("22nd, March 2022");
        assertEquals("22nd, March 2022", customerOrder.getDateOrdered());
    }
    @Test
    public void testThatSystemCanAcceptDateShipped(){
        Order customerOrder = new Order();
        customerOrder.setDateShipped("23rd, April 2022");
        assertEquals("23rd, April 2022", customerOrder.getDateShipped());
    }
    @Test
    public void testThatSystemCanAcceptCustomerName(){
        Order customerOrder = new Order();
        customerOrder.setCustomerName("Ishola Janet");
        assertEquals("Ishola Janet", customerOrder.getCustomerName());
    }
    @Test
    public void testThatSystemCanAcceptCustomerAddress(){
        Order customerOrder = new Order();
        customerOrder.setCustomerAddress("312 Herbert Macaulay Sabo-Yaba");
        assertEquals("312 Herbert Macaulay Sabo-Yaba", customerOrder.getCustomerAddress());
    }
    @Test
    public void testThatSystemCanAcceptShippingDetails(){
        Order customerOrder = new Order();
        customerOrder.setShippingDetails("Semicolon");
        assertEquals("Semicolon", customerOrder.getShippingDetails());
    }





}
