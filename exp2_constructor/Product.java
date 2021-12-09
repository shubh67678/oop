import java.util.*;

// Create a Main class
public class Product {
    String productName = "Not set";
    int productPrice = -1;

    public void printProductDetails() {
        System.out.println("The product name: " + this.productName);
        System.out.println("The product cost: " + this.productPrice);
        System.out.println("");
    }
    public Product() {
        System.out.println("Create only product\n"); // Print the value of x
    }

    public Product(String name) {
        this.productName = name;
        System.out.println("Create product with name: " + name); // Print the value of x
    }

    public Product(String name,int price) {
        this.productName = name;
        this.productPrice = price; 
        System.out.println("Create product with name:" + name +" and price: " + price); // Print the value of x
    }

}
