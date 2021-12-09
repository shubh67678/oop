import java.util.*;


// Base class 
abstract class User {
    String name;
    int age;

    void printUserStamp() {
        System.out.println("");
        System.out.println("Inside the user class");
        System.out.println("");
    }


    void printUserInfo() {
    };

    void inputNameAge() {
        printUserStamp();
        Scanner scanner_obj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the name of the user");
        this.name = scanner_obj.nextLine();
        System.out.println("Enter the age");
        this.age = scanner_obj.nextInt();
        // String waste = scanner_obj.nextLine();

        // scanner_obj.close();
    }
    
    void printUserDetails()
    {

        System.out.println(this.name);
        System.out.println(this.age);
    }
}

// hierarchical inheritance
class Buyer extends User {
    String address;
    String cardID;

    void printBuyerInfo() {
        printUserDetails();
        System.out.println(this.address);
        System.out.println(this.cardID);
    }

    void printBuyerStamp() {
        System.out.println("");
        System.out.println("Inside the buyer class");
        System.out.println("");
    }

    void inputBuyerDetails() {
        printBuyerStamp();

        inputNameAge();
        Scanner scan_obj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter address for the user");
        this.address = scan_obj.nextLine();
        System.out.println("Enter the credit card id");
        this.cardID = scan_obj.nextLine();
        // scan_obj.close();
    }
    
}

// hierarchical inheritance
class Seller extends User{
    String GSTno;
    int rating;
    void printSellerInfo() {
        printUserDetails();
        System.out.println(this.GSTno);
        System.out.println(this.rating);
    }

    void printSellerStamp() {
        System.out.println("");
        System.out.println("Inside the Seller class");
        System.out.println("");
    }

    void inputSellerDetails() {
        printSellerStamp();

        inputNameAge();
        Scanner scan_obj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter GSTno for the user");
        this.GSTno = scan_obj.nextLine();
        System.out.println("Enter the rating for the seller");
        this.rating = scan_obj.nextInt();
        // scan_obj.close();
    }
}

// Multilevel inheritance
class PremiumBuyer extends Buyer {
    String validPremiumTill;
    int premiumAmount;

    void printPremiumBuyerInfo() {
        printBuyerInfo();
        System.out.println(this.validPremiumTill);
        System.out.println(this.premiumAmount);
    }

    void printPremiumBuyerStamp() {
        System.out.println("");
        System.out.println("Inside the Premium Buyer class");
        System.out.println("");
    }

    void inputPremiumBuyerDetails() {
        printPremiumBuyerStamp();

        inputBuyerDetails();
        Scanner scan_obj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the validity of the premium account");
        this.validPremiumTill = scan_obj.nextLine();
        System.out.println("Enter the amount id");
        this.premiumAmount = scan_obj.nextInt();
        // scan_obj.close();
    }
}

public class Main {
    public static void main(String args[]){
        // System.out.println("test");
        // PremiumBuyer t = new PremiumBuyer();
        // t.inputPremiumBuyerDetails();
        Scanner scan_obj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Welcome to our portal!");
        System.out.println("Select who would you want to be");
        System.out.println("1: Buyer");
        System.out.println("2: Seller");
        System.out.println("3: Premium buyer");
        int op = scan_obj.nextInt();
        
        if (op == 1) {
            Buyer b = new Buyer();
            b.inputBuyerDetails();
            System.out.println("");
            System.out.println("");
            System.out.println("Print buyer details");
            b.printBuyerInfo();
        }
        if (op == 2) {
            Seller b = new Seller();
            b.inputSellerDetails();
            System.out.println("");
            System.out.println("");
            
            System.out.println("Print seller details");

            b.printSellerInfo();
        }
        if (op == 3) {
            PremiumBuyer b = new PremiumBuyer();
            b.inputPremiumBuyerDetails();
            System.out.println("");
            System.out.println("");
            
            System.out.println("Print premium buyer details");
            b.printPremiumBuyerInfo();
        }
       
    }
}