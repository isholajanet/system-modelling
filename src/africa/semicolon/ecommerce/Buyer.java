package africa.semicolon.ecommerce;

public class Buyer {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private String passWord;
    public void setBuyerFirstName(String firstName){
        this.firstName = firstName;

    }

    public String getBuyerFirstName() {
        return firstName;

    }

    public void setBuyerLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBuyerLastName() {
        return lastName;
    }

    public void setBuyerEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCustomerEmailAddress() {
        return emailAddress;
    }

    public void setBuyerPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBuyerPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuyerAddress() {
        return address;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }
}
