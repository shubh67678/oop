import java.util.*;

// Create a Main class
public class Product {
    String productName = "Parent product";
    int productPrice = 200;

    public void printProductDetails() {
        System.out.println("The product name: " + this.productName);
        System.out.println("The product cost: " + this.productPrice);
        System.out.println("");
    }
    public Product() {
        System.out.println("Create a parent product"); // Print the value of x
    }


}
