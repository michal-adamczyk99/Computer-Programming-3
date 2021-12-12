import java.util.ArrayList;
public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public Library(String name) {
        this.name = name;
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public ArrayList<Book> getBooks() {
        return this.books;
    }
    
    public static void main(String[] args) {
        Library library = new Library("Library1");
        Publisher publisher = new Publisher("Testname", "Testcity");
        Writer writer = new Writer("Test", "Testing", "Testgenre");
        Book book4 = new Book("title1", writer, publisher, 2021);
        book4.display();
        
        
    }
    
    
}