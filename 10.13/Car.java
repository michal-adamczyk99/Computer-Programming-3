public class Car extends Vehicle {
    private String bodyStyle;
    
    public Car(String brand, String model, int year, String bodyStyle) {
        super(brand, model, year);
        this.bodyStyle = bodyStyle;
    }
    
    public void drive() {
        System.out.println("The car is driving...");
    }
    public void displayDetails() {
        System.out.println(super.toString() + "\nBody Style: " + this.bodyStyle);
    }
}