package africa.semocolon.rideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {
    @Test
    public void testThatSystemCanAcceptPaymentType(){
        Payment myPayment = new Payment();
        myPayment.setPaymentType("Cash");
        assertEquals("Cash", myPayment.getPaymentType());
    }
    public void testThatSystemCanAcceptAmount(){
        Payment myPayment = new Payment();
        myPayment.setAmount(20000);
        assertEquals(20000, myPayment.getAmount());
    }
}
