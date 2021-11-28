public class Chapter {
    private String title;
    private int numberOfPages;
    private int startingPageNumber;
    
    public Chapter(String title, int numberOfPages, int startingPageNumber) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.startingPageNumber = startingPageNumber;
    }
    
    public String toString() {
        return "Title: " + this.title + "\nNumber of pages: " + this.numberOfPages + "\nStarting Page Number" + this.startingPageNumber;
    }
    
    public static void main(String[] args) {
        Book book = new Book("test1", 2000, true);
        book.addChapter("testing", 20, 1);
        book.addChapter("testing1", 20, 20);
        System.out.println(book);
    }
}