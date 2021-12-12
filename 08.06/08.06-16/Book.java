public class Book {
    private String title;
    private Writer author;
    private Publisher publisher;
    private int yearOfPublication;
    
    public Book(String title, Writer author, Publisher publisher, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(Writer author) {
        this.author = author;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
    public String getTitle() {
        return this.title;
    }
    public Writer getAuthor() {
        return this.author;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    
    public void display() {
        System.out.println("Title: " + this.title + "\nAuthor: \n" + this.author + "\nPublisher: " + "\n" + this.publisher + "\nYear of Publication: " + this.yearOfPublication);
    }
    
    public Publisher getPublisher() {
        return this.publisher;
    }
    
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Testname", "Testcity");
        Writer writer = new Writer("Test", "Testing", "Testgenre");
        Book book = new Book("Test", writer, publisher, 2021);
        Book book1 = new Book("Test1", writer, publisher, 2021);
        book.display();
        book1.display();
    }
    
    
    
    
}