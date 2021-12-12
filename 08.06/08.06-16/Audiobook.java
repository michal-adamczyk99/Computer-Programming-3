public class Audiobook extends Book {
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, Writer author, int minutes, int seconds, Publisher publisher, int yearOfPublication) {
        super(title, author, publisher, yearOfPublication);
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
        System.out.println("Title: " + this.getTitle() + "\nAuthor: \n" + this.getAuthor() + "\nMinutes: " + this.getMinutes() + "\nSeconds: " + this.getSeconds() + "\nPublisher: \n" + this.getPublisher() + "\nYear: " + this.getYearOfPublication());
    }
    
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Testname", "Testcity");
        Writer writer = new Writer("Test", "Testing", "Testgenre");
        Book book3 = new Book("Tester", writer, publisher, 2021);
        book3.display();
        Audiobook audiobook = new Audiobook("Testing", writer, 5, 23, publisher, 2021);
        Audiobook audiobook1 = new Audiobook("Testing1", writer, 15, 20, publisher, 2021);
        audiobook.display();
        audiobook1.display();
    }
    
}