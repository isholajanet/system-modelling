package africa.semicolon.ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void testThatSystemCanAcceptProductName(){
        Product myProduct = new Product();
        myProduct.setProductName("T-shirt");
        assertEquals("T-shirt", myProduct.getProductName());
    }
    @Test
    public void testThatSystemCanAcceptProductPrice(){
        Product myProduct = new Product();
        myProduct.setProductPrice(1200);
        assertEquals(1200, myProduct.getProductPrice());
    }
    @Test
    public void testThatSystemCanAcceptImageFileName(){
        Product myProduct = new Product();
        myProduct.setImageFileName("t-shirt.png");
        assertEquals("t-shirt.png", myProduct.getImageFileName());

    }
}
