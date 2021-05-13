package africa.semicolon.ecommerce;

public class Payment {
    private String cardName;
    private String cardNumber;
    private String cardType;
    private int cvv;
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

    public void setCVV(int cvv) {
        this.cvv = cvv;
    }

    public int getcvv() {
        return cvv;
    }

    public void getEmailAddress(String emailAddress) {

    }
}
