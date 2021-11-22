public class Product {
    private String name;
    private int quantity;
    
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getName() {
        return this.name;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public String toString() {
        return "Name: " + this.getName() + " Quantity: " + this.getQuantity();
    }
    
    Product(String name, int quantity) {
        this.setName(name);
        this.setQuantity(quantity);
    }
}