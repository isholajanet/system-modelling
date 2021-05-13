package africa.semicolon.ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartItemTest {
    @Test
    public void testThatSystemCanAcceptCartItemsName(){
        CartItems myCartItems = new CartItems();
        myCartItems.setCartItemsName("A jug");
        assertEquals("A jug", myCartItems.getCartItemsName());

    }
    @Test
    public void testThatSystemCanAcceptProductId(){
        CartItems myCartItems = new CartItems();
        myCartItems.setProductId(001);
        assertEquals(001, myCartItems.getProductId());
    }
    @Test
    public void testThatSystemCanAcceptQuantity(){
        CartItems myCartItems = new CartItems();
        myCartItems.setProductQuantity(5);
        assertEquals(5, myCartItems.getProductQuantity());
    }
    @Test
    public void testThatSystemCanAcceptUnitCost(){
        CartItems myCartItems = new CartItems();
        myCartItems.setUnitCost(200);
        assertEquals(200, myCartItems.getUnitCost());
    }
    @Test
    public void testThatSystemCanAcceptToTotalCost(){
        CartItems myCartItems = new CartItems();
        myCartItems.setTotalCost(2000);
        assertEquals(2000, myCartItems.getTotalCost());
    }
}
