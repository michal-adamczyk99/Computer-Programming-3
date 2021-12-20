public class Truck extends Vehicle {
    private int cargoWeight;
    
    public Truck(String brand, String model, int year, int cargoWeight) {
        super(brand, model, year);
        this.cargoWeight = cargoWeight;
    }
    
    public void drive() {
        System.out.println("The truck is driving...");
    }
    public void displayDetails() {
        System.out.println(super.toString() + "\nMaximum weight of cargo: " + this.cargoWeight);
    }
}