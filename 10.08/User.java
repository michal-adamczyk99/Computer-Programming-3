public class User {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    
    public User(String name, String surname, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nSurname: " + this.surname + "\nEmail: " + this.email + "\nPhone Number: " + this.phoneNumber;
    }
}