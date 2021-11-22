public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int power;
    private boolean isOn;
    private int fuelLevel;
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    public void setFuelLevel(int amount) {
        if (amount <= 100 & amount >= 0) {
            this.fuelLevel = amount;
        } else {
            System.out.println("Wrong amount!");
        }
    }
    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public String getColor() {
        return this.color;
    }
    public int getPower() {
        return this.power;
    }
    public boolean getIsOn() {
        return this.isOn;
    }
    public int getFuelLevel() {
        return this.fuelLevel;
    }
    
    Car(String brand, String model, int year, String color, int power, int fuelLevel) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
        this.setColor(color);
        this.setPower(power);
        this.setIsOn(false);
        this.setFuelLevel(fuelLevel);
    }
    
    public void startEngine() {
        this.setIsOn(true);
    }
    public void stopEngine() {
        this.setIsOn(false);
    }
    public void drive() {
        if (this.isOn & this.fuelLevel > 20) {
        this.fuelLevel -= 20;
        } else {
            if (this.isOn == false) {
                System.out.println("You have to start the engine first!");
            }
            if (this.fuelLevel < 20) {
                System.out.println("Fuel level low! Please refuel!");
            }
        }
    }
    public void refuel(int amount) {
        if (this.isOn == false) {
            if ((this.fuelLevel + amount) <= 100 & amount > 0) {
                this.fuelLevel += amount;
            } else {
                System.out.println("Amount is too big!");
            }
        } else {
            System.out.println("You have to stop the engine first!");
        }
        }
    public void displayFuelLevel() {
        System.out.println("Fuel level: " + this.getFuelLevel());
    }
    public String toString() {
        return "Brand: " + this.getBrand() + " Model: " + this.getModel() + " Year: " + this.getYear() + " Color: " + this.getColor() + " Power: " + this.getPower() + " HP" + " Engine running: " + this.getIsOn() + " Fuel Level: " + this.getFuelLevel();
        
    }
}