import java.util.ArrayList;
public class Seller {
    private String companyName;
    private ArrayList<Product> products = new ArrayList<Product>();
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    Seller(String companyName) {
        this.companyName = companyName;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    public void sell(Product product, Customer customer) {
        customer.buy(products.get(products.indexOf(product)), this);
        products.get(0).setQuantity(products.get(0).getQuantity() - 1);
    }

    
}