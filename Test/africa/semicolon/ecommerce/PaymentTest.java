package africa.semicolon.ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {
    @Test
    public void testThatSystemCanAcceptCardName(){
        Payment customerPayment = new Payment();
        customerPayment.getCardName("Ishola Janet");
        assertEquals("Ishola Janet", customerPayment.getCardName());
    }
    @Test
    public void testThatSystemCanAcceptCardNumber(){
        Payment customerPayment = new Payment();
        customerPayment.setCardNumber("1130427890");
        assertEquals("1130427890", customerPayment.getCardNumber());
    }
    @Test
    public void testThatSystemCanAcceptCardType(){
        Payment customerPayment = new Payment();
        customerPayment.setCardType("Master");
        assertEquals("Master", customerPayment.getCustomerPayment());
    }
}
