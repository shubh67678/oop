package main;

import java.util.*;
import support.MovieObject;

public class Exp8 {
    static String def = "this is default";
    static private String pri = "this is private";
    static protected String pro = "this is protected";
    static public String pub = "this is public";

    public static void main(String[] args) {
        class Diff extends MovieObject {
            public void print() {
                System.out.println(" DEFAULT : (modef) = ***ERROR***"/* + modef */);
                System.out.println(" PRIVATE : (mopri) = ***ERROR***"/* + mopri */);
                System.out.println(" PROTECTED : (mopro) = " + mopro);
                System.out.println(" PUBLIC : (mopub) = " + mopub);
            }
        }
        MovieObject mo = new MovieObject();
        System.out.println("------------------ SAME CLASS ---------------");
        System.out.println(" DEFAULT : (def) = " + def);
        System.out.println(" PRIVATE : (pri) = " + pri);
        System.out.println(" PROTECTED : (pro) = " + pro);
        System.out.println(" PUBLIC : (pub) = " + pub);
        System.out.println("------------------ SAME PACKAGE, SUBCLASS ---------------");
        Sub su = new Sub();
        su.print();
        System.out.println("------------------ DIFFERENT PACKAGE SUBCLASS ---------------");
        Diff diff = new Diff();
        diff.print();
        System.out.println("------------------ DIFFERENT PACKAGE NON SUBCLASS -------------");
        System.out.println(" DEFAULT : (mo.name) = ***ERROR***" /* + mo.name */);
        System.out.println(" PRIVATE : (mo.year) = ***ERROR***" /* + mo.year */);
        System.out.println(" PROTECTED : (mo.director) = ***ERROR***" /* + mo.director */);
        System.out.println(" PUBLIC : (mo.category) = " + mo.category);
    }
}
