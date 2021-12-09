package main;

public class Product {
    int price = 12000; // default
    public int rating = 2;
    protected int cost_of_making = 10;
    private int quantity = 30;

    void printAvailableData() {
        System.out.println("------------------------------------------");
        System.out.println("Access from the same class");
        System.out.println("------------------------------------------");

        System.out.println("private data variable:");
        System.out.println("quantity: " + quantity);
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