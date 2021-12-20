public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    
    
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public abstract void drive();
    public String toString() {
        return "Brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year;
    }
    public abstract void displayDetails();
}