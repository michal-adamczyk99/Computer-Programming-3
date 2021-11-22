public class Printer {
    private String model;
    private int paperLevel;
    private int inkLevel;
    private boolean isOn;
    
    public void setModel(String model) {
        this.model = model;
    }
    public void setPaperLevel(int paperLevel) {
        if (paperLevel <= 100 & paperLevel >= 0) {
            this.paperLevel = paperLevel;
        }
    }
    public void setInkLevel(int inkLevel) {
        if (inkLevel <= 100 & inkLevel >= 0) {
            this.inkLevel = inkLevel;
        }
    }
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    public String getModel() {
        return this.model;
    }
    public int getPaperLevel() {
        return this.paperLevel;
    }
    public int getInkLevel() {
        return this.inkLevel;
    }
    public boolean getIsOn() {
        return this.isOn;
    }
    
    Printer(String model) {
        this.setModel(model);
        this.setPaperLevel(100);
        this.setInkLevel(100);
        this.setIsOn(false);
    }
    
    public void print(int pages) {
        if (this.isOn) {
            if (this.paperLevel > pages & this.inkLevel > pages) {
                this.paperLevel -= pages;
                this.inkLevel -= pages;
                System.out.println("Printing...Success!");
            } else {
                System.out.println("Insufficient paper or ink level! Please refill!");
            }
        } else {
            System.out.println("You must turn the printer on first!");
        }
    }
    
    public void refillPaper() {
        this.setPaperLevel(100);
    }
    public void refillInk() {
        this.setInkLevel(100);
    }
    
    public String toString() {
        return "Model name: " + this.getModel() + " Paper Level: " + this.getPaperLevel() + " Ink Level: " + this.getInkLevel() + " Printer on: " + this.getIsOn();
    }
    
    public void turnOn() {
        this.setIsOn(true);
    }
    public void turnOff() {
        this.setIsOn(false);
    }
}