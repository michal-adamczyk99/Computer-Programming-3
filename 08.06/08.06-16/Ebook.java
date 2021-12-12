public class Ebook extends Book {
    private String fileName;
    
    public Ebook(String title, Writer author, String fileName, Publisher publisher, int yearOfPublication) {
        super(title, author, publisher, yearOfPublication);
        this.fileName = fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return this.fileName;
    }
    
    public void display() {
        System.out.println("Title: " + this.getTitle() + "\nAuthor: \n" + this.getAuthor() + "\nFile Name: " + this.getFileName() + "\nPublisher: \n" + this.getPublisher() + "\nYear of Publication: " + this.getYearOfPublication());
    }
    
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Testname", "Testcity");
        Writer writer = new Writer("Test", "Testing", "Testgenre");
        Book book2 = new Book("Test2", writer, publisher, 2021);
        book2.display();
        Ebook ebook = new Ebook("Test3", writer, "Test3", publisher, 2021);
        Ebook ebook1 = new Ebook("Test4", writer, "Test4", publisher, 2021);
        ebook.display();
        ebook1.display();
    }
}