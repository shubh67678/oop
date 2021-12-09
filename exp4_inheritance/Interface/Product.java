// interface implementation
public class Product implements SubProduct {
    String productName = "Parent product";
    int productPrice = 200;


    public void printProductDetails() {
        System.out.println("Inside the interface function");

        System.out.println("The product name: " + this.productName);
        System.out.println("The product price: " + this.productPrice);
    }
    public Product(String name, int price) {
        System.out.println("Create a product"); // Print the value of x
        this.productName = name;
        this.productPrice = price;
    }
}
