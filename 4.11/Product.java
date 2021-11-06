public class Product {
    private String name;
    private boolean isVegetarian;
    //getters
    public String getName() {
        return this.name;
    }
    public boolean getIsVegetarian() {
        return this.isVegetarian;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    
    Product(String name, boolean isVegetarian) {
        this.setName(name);
        this.setIsVegetarian(isVegetarian);
    }
    public static void main(String[] args) {
        Product instance1 = new Product("Marchew", true);
        System.out.println(instance1.getName());
        System.out.println(instance1.getIsVegetarian());
    }
}