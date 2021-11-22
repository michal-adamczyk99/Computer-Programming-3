import java.util.ArrayList;
public class Customer {
    private String name;
    private String surname;
    private int yearOfBirth;
    private ArrayList<Product> products = new ArrayList<Product>();
    
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    Customer(String name, String surname, int yearOfBirth) {
        this.setName(name);
        this.setSurname(surname);
        this.setYearOfBirth(yearOfBirth);
    }
    
    public void buy(Product product, Seller seller) {
        products.add(product);
        seller.sell(product, this);
        
    }
}