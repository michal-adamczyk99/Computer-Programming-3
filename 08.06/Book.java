public class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    
    public void display() {
        System.out.println("Title: " + this.title + "\nAuthor: " + this.author);
    }
    
    public static void main(String[] args) {
        Book book = new Book("Test", "Test");
        Book book1 = new Book("Test1", "Test1");
        book.display();
        book1.display();
    }
    
    
    
    
}