package main;

public class Sub extends Movie {
    public void print() {
        System.out.println(" PRIVATE : (pvt) = ***ERROR***" /* + pvt */);
        System.out.println(" PROTECTED : (budget) = " + budget);
        System.out.println(" PUBLIC : (rating) = " + rating);
        System.out.println(" DEFAULT : (duration) = " + duration);
    }
}