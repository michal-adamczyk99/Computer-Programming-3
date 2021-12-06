public class Audiobook extends Book {
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public int getMinutes() {
        return this.minutes;
    }
    public int getSeconds() {
        return this.seconds;
    }
    
    public void display() {
        System.out.println("Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nMinutes: " + this.getMinutes() + "\nSeconds: " + this.getSeconds());
    }
    
    public static void main(String[] args) {
        Book book3 = new Book("Tester", "Tester");
        book3.display();
        Audiobook audiobook = new Audiobook("Testing", "Testing", 5, 23);
        Audiobook audiobook1 = new Audiobook("Testing1", "Testing1", 15, 20);
        audiobook.display();
        audiobook1.display();
    }
    
}