package main;

public class ChildClass extends Product {
    public void printFromSubClass() {
        System.out.println("------------------------------------------");
        System.out.println("Access from same package, child of the Product class");
        System.out.println("------------------------------------------");
        /*
         * int price = 12000; public int rating = 2; protected int cost_of_making = 10;
         * private int quantity = 30;
         */
        System.out.println("private data variable:");
        System.out.println("quantity: ERROR");
        System.out.println("");

        System.out.println("protected data variable");
        System.out.println("cost_of_making: " + cost_of_making);
        System.out.println("");
        System.out.println("public data variable");
        System.out.println("rating: " + rating);
        System.out.println("");
        System.out.println("default data variable");
        System.out.println("price: " + price);
        System.out.println("------------------------------------------");

    }
}