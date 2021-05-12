package africa.semicolon.ecommerce;

public class Payment {
    private String cardName;
    private String cardNumber;
    private String cardType;
    public void getCardName(String name) {
        this.cardName = name;
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCustomerPayment() {
        return cardType;
    }
}
