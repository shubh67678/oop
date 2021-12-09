import java.util.*;
import java.io.FileWriter; 
import java.io.BufferedReader;
import java.io.FileReader; 

public class Main {
    public static void main(String[] args) {
        
        Product parentProductObj = new Product();

        Scanner scanner_obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input the number of items you want to add");
        int numInput = scanner_obj.nextInt();
        String waste = scanner_obj.nextLine();
        
        Product productArr[] = new Product[numInput];
        String curName = "";
        int curVal = 0; 
        for (int i = 0; i < numInput; i++) {

            System.out.println("Select an option");
            System.out.println("1: Have name but no price");
            System.out.println("2: Have name and price");
            int optionVal = scanner_obj.nextInt() + 1;
            if (optionVal == 2) {
                System.out.println("Input the name of item you want to add");
                waste = scanner_obj.nextLine();
                curName = scanner_obj.nextLine();
                // productArr[i] = new Product(curName);
                Product p = new Product();
                p.printProductDetails(curName);
            }
            if (optionVal == 3) {
                System.out.println("Input the name of item you want to add");
                waste = scanner_obj.nextLine();
                curName = scanner_obj.nextLine();
                System.out.println("Input the price of item you want to add");
                curVal = scanner_obj.nextInt();

                Product p = new Product();
                p.printProductDetails(curName,curVal);
            }

        }
    }
}