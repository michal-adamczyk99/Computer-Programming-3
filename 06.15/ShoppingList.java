import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList {
    private ArrayList<String> list = new ArrayList<String>();
    
    public void addProduct(String product) {
        this.list.add(product);
    }
    public void displaySize() {
        System.out.println("Number of products to purchase: " + this.list.size());
    }
    public void displayList() {
        System.out.println("Shopping List:");
        for (String i : this.list) {
            System.out.println(i);
        }
    }
    public void enterProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a product:");
        this.list.add(scanner.nextLine());
    }
    
    public static void main(String[] args) {
        ShoppingList list1 = new ShoppingList();
        list1.displayList();
        list1.displaySize();
        list1.addProduct("Marchewka");
        list1.addProduct("Ziemniaki");
        list1.addProduct("Mleko");
        list1.displayList();
        list1.displaySize();
        list1.addProduct("Bułki");
        list1.displayList();
        list1.displaySize();
        list1.enterProduct();
        list1.displayList();
    }
}