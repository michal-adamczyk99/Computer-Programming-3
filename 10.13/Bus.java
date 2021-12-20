public class Bus extends Vehicle {
    private int seatsNumber;
    
    public Bus(String brand, String model, int year, int seatsNumber) {
        super(brand, model, year);
        this.seatsNumber = seatsNumber;
    }
    
    public void drive() {
        System.out.println("The bus is driving...");
    }
    public void displayDetails() {
        System.out.println(super.toString() + "\nNumber of seats: " + this.seatsNumber);
    }
}