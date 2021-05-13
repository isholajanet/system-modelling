package africa.semicolon.ecommerce;

public class Product {
    private String productName;
    private int productId;
    private String description;
    private int price;
    private String imageFileName;


    public void setProductName(String productName) {
        this.productName = productName;

    }

    public String getProductName() {

        return productName;
    }

    public void setProductPrice(int productPrice) {
        this.price = productPrice;
    }

    public int getProductPrice() {
        return price;
    }

    public void setImageFileName(String productImageFileName) {
        this.imageFileName = productImageFileName;
    }

    public String getImageFileName() {
        return imageFileName;
    }
}
