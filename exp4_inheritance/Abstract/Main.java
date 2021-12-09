import java.util.*;
import java.io.FileWriter; 
import java.io.BufferedReader;
import java.io.FileReader;

/*
Abstract class 
*/

// Abstract function implementation
class FullProduct extends SubProduct {
    String productName = "Parent product";
    int productPrice = 200;

    public void printProductDetails() {
        System.out.println("");
        System.out.println("The function definition of the child class");

        System.out.println("The product name: " + this.productName);
        System.out.println("The product price: " + this.productPrice);
    }

    public FullProduct(String name, int price) {
        System.out.println("Create a product"); // Print the value of x
        this.productName = name;
        this.productPrice = price;
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner scanner_obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input the number of items you want to add");
        int numInput = scanner_obj.nextInt();

        String curName = "";
        int curVal = 0; 
        for (int i = 0; i < numInput; i++) {

            int optionVal = 3;
            if (optionVal == 3) {
                System.out.println("Input the name of item you want to add");
                String waste = scanner_obj.nextLine();
                curName = scanner_obj.nextLine();
                System.out.println("Input the price of item you want to add");
                curVal = scanner_obj.nextInt();

                FullProduct p = new FullProduct(curName, curVal); //
                p.printProductDetails();
            }
        }
    }
}