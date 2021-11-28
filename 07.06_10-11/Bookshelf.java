import java.util.ArrayList;
public class Bookshelf {
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public Bookshelf(String name) {
        this.name = name;
    }
    
     public void addBook(Book book) {
        this.books.add(book);
    }
    
    public void removeBook(String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle() == title) {
                this.books.remove(i);
                break;
            }
        }
    }
    
    public void displayContent() {
        System.out.println("Books: " + this.books.toString());
    }
    
    public static void main(String[] args) {
        Book book = new Book("test", 2000, true);
        Book book1 = new Book("test1", 2000, true);
        Bookshelf bookshelf = new Bookshelf("testshelf");
        bookshelf.addBook(book);
        bookshelf.addBook(book1);
        bookshelf.displayContent();
        bookshelf.removeBook("test1");
        bookshelf.displayContent();
    }
}