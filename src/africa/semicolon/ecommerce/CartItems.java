package africa.semicolon.ecommerce;

public class CartItems {
    private String cartItemsName;
    private int productId;
    private int quantity;
    private int unitCost;
    private int totalCost;
    public void setCartItemsName(String cartItemsName) {
        this.cartItemsName = cartItemsName;
    }

    public String getCartItemsName() {
        return cartItemsName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getProductId(){
        return productId;
    }

    public void setProductQuantity(int productQuantity) {
        this.quantity = productQuantity;
    }

    public int getProductQuantity(){
        return quantity;
    }

    public void setUnitCost(int unitCost) {
        this.unitCost = unitCost;
    }

    public int getUnitCost(){
        return unitCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalCost(){
        return totalCost;
    }
}
