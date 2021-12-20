public class Email extends Message {
    private String subject;
    private User user;
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /*public void setRecipientAdress(String recipientAdress) {
        this.recipientAdress = recipientAdress;
    }*/
    
    public String getSubject() {
        return this.subject;
    }
    /*public String getRecipientAdress() {
        return this.recipientAdress;
    }*/
    
    public Email(String text, String subject, User user) {
        super(text);
        this.subject = subject;
        this.user = user;
    }
    
    public void send() {
        System.out.println("User: \n" + this.user + "\nSubject: " + this.subject + "\nMessage: " + this.getText());
    }
    
    public static void main(String[] args) {
        User user = new User("Tester", "Testering", "test@test.com", "123456789");
        Email email = new Email("Test", "test", user);
        email.send();
    }
}