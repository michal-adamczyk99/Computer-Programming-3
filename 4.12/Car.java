public class Car {
    private String brand;
    private String model;
    private int modelYear;
    private boolean isOn = false;
    
    //getters
    
    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getModelYear() {
        return this.modelYear;
    }
    public boolean getIsOn() {
        return this.isOn;
    }
    
    //setters
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    Car(String brand, String model, int modelYear) {
        this.setBrand(brand);
        this.setModel(model);
        this.setModelYear(modelYear);
    }
    
    public void turnOn() {
        this.setIsOn(true);
    }
    public void turnOff() {
        this.setIsOn(false);
    }
    public void displayInfo() {
        System.out.println("Brand: " + this.getBrand() + " Model: " + this.getModel() + " Year: " + this.getModelYear() + " Engine on: " + this.getIsOn());
    }
    
    public static void main(String[] args) {
        Car opel = new Car("Opel", "Astra", 2000);
        opel.turnOn();
        opel.displayInfo();
        opel.turnOff();
        opel.displayInfo();        
    }
}