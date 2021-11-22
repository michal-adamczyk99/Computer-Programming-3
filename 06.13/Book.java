import java.util.Arrays;
public class Book {
    private String type;
    private String author;
    private int year;
    private int numberOfPages;
    
    public void setType(String type) {
        String[] types = new String[]{"crime", "drama", "fantasy", "science fiction"};
        if (Arrays.asList(types).contains(type)) {
            this.type = type;
        }
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    public String getType() {
        return this.type;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public int getNumberOfPages() {
        return this.numberOfPages;
    }
}