import java.util.ArrayList;
public class Book {
    private String title;
    private Writer author;
    private int yearOfRelease;
    private boolean isReleased;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    private int numberOfChapters=0;
    
    public Book(String title, int yearOfRelease, boolean isReleased) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.isReleased = isReleased;
    }
    
    public String toString() {
        return "Title: " + this.title + "\nYear Of Release: " + this.yearOfRelease + "\nAuthor:\n" + this.author  + "\nReleased: " + this.isReleased + "\nNumber of chapters: " + this.numberOfChapters;
        
    }
    
    public String getAuthor() {
        return this.author.toString();
    }
    
    public void addAuthor(Writer author) {
        this.author = author;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void addChapter(String title, int numberOfPages, int startingPageNumber) {
        Chapter chapter = new Chapter(title, numberOfPages, startingPageNumber);
        this.chapters.add(chapter);
        this.numberOfChapters += 1;
    }
    
    public void displayChapters() {
        for (Chapter i : chapters) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Writer writer = new Writer("Adam", "Niedam", 1980);
        Book book = new Book("Test", 2000, true);
        book.addAuthor(writer);
        writer.addBook(book);
        System.out.println(writer);
        System.out.println(book);
        System.out.println(writer.getBooks());
    }
}