public abstract class Message {
    private String text;
    
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return this.text;
    }
    
    public Message() {};
    public Message(String text) {
        this.text = text;
    }
    
    int charNumber() {
        return this.text.length();
    }
    
    public abstract void send();
}