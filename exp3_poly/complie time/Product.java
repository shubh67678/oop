import java.util.*;

public class Product {
    String productName = "Parent product";
    int productPrice = 200;

    public void printProductDetails(String productName){
        System.out.println("The product name: " + productName);
    }

    public void printProductDetails(String productName, int price) {
        System.out.println("The product name: " + productName);
        System.out.println("The product price: " + price);
    }
    public Product() {
        System.out.println("Create a parent product"); // Print the value of x
    }
}
