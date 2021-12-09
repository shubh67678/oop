import java.util.*;
import java.io.FileWriter; 
import java.io.BufferedReader;
import java.io.FileReader; 

public class Main {
    public static void main(String[] args) {
        
        Product parentProductObj = new Product();
        SubProduct subProductObj = new SubProduct();


        parentProductObj.printProductDetails();
        subProductObj.printProductDetails();

        Product parentObj = new SubProduct();
        parentObj.printProductDetails();

    } 
}