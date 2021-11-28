import java.util.ArrayList;
public class Writer {
    private String name;
    private String surname;
    private int yearOfBirth;
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public Writer(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public ArrayList<Book> getBooks() {
        return this.books;
    }
    
    public int countBooks() {
        return this.books.size();
    }
    
    public String toString() {
        return "Name: " + this.name + "\nSurname: " + this.surname + "\nYear Of Birth: " + this.yearOfBirth + "\nNumber Of Books: " + this.countBooks();
    }
}