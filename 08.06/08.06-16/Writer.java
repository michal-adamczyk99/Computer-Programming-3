public class Writer {
    private String name;
    private String surname;
    private String genre;
    
    public Writer(String name, String surname, String genre) {
        this.name = name;
        this.surname = surname;
        this.genre = genre;
    }
    
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getGenre() {
        return this.genre;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nSurname: " + this.surname + "\nGenre: " + this.genre;
    }
}