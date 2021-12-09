package main;

import otherpackage.ProductInOtherPackage;

public class Main {
    public static void main(String[] args) {
        // same package
        ChildClass a = new ChildClass();
        a.printAvailableData();
        a.printFromSubClass();

        // new sub-class from different package
        class SubClassOfDiffPackage extends ProductInOtherPackage {
            int price = 12000; // default
            public int rating = 2;
            protected int cost_of_making = 10;
            private int quantity = 30;

            void printSubClass() {
                System.out.println("------------------------------------------");
                System.out.println("Access from different package, child of the Product class");
                System.out.println("------------------------------------------");
                System.out.println("private data variable:");
                System.out.println("quantity: ERROR");
                System.out.println("");
                System.out.println("protected data variable");
                System.out.println("cost_of_making: ERROR");
                System.out.println("");
                System.out.println("public data variable");
                System.out.println("rating: " + rating);
                System.out.println("");
                System.out.println("default data variable");
                System.out.println("price: " + price);
                System.out.println("------------------------------------------");
            }

        }
        SubClassOfDiffPackage b = new SubClassOfDiffPackage();
        b.printSubClass();
        // different package class
        ProductInOtherPackage otherPackageObject = new ProductInOtherPackage();
        System.out.println("------------------------------------------");
        System.out.println("Access from different package");
        System.out.println("------------------------------------------");
        System.out.println("private data variable:");
        System.out.println("quantity: ERROR");
        System.out.println("");

        System.out.println("protected data variable");
        System.out.println("cost_of_making: ERROR");
        System.out.println("");

        System.out.println("default data variable");
        System.out.println("rating: ERROR");
        System.out.println("");
        System.out.println("public data variable");
        System.out.println("rating: " + otherPackageObject.rating);
        System.out.println("");

        System.out.println("------------------------------------------");

    }
}
