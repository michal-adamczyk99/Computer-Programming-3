public class Ebook extends Book {
    private String fileName;
    
    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return this.fileName;
    }
    
    public void display() {
        System.out.println("Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nFile Name: " + this.getFileName());
    }
    
    public static void main(String[] args) {
        Book book2 = new Book("Test2", "Test2");
        book2.display();
        Ebook ebook = new Ebook("Test3", "Test3", "Test3");
        Ebook ebook1 = new Ebook("Test4", "Test4", "Test4");
        ebook.display();
        ebook1.display();
    }
}