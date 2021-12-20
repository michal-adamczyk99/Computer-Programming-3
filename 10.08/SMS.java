public class SMS extends Message {
    private User user;
    
    public SMS(String text, User user) {
        super(text);
        this.user = user;
    }
    
    /*public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }*/
    /*public String getPhoneNumber() {
        return this.phoneNumber;
    }*/
    
    public void send() {
        System.out.println("User: \n" + this.user + "\nMessage: " + this.getText());
    }
    
    public static void main(String[] args) {
        User user = new User("Tester", "Testering", "test@test.com", "123456789");
        SMS sms = new SMS("text", user);
        sms.send();
    }
}