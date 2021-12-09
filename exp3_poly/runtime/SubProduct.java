// Create a Main class
public class SubProduct extends Product {
    String productName = "sub product";
    int productPrice = -1;

    public void printProductDetails() {
        System.out.println("The product name: " + this.productName);
        System.out.println("The product cost: " + this.productPrice);
        System.out.println("");
    }

    public SubProduct() {
        System.out.println("inside sub product\n");
    }
}