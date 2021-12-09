package support;

import java.util.*;

public class MovieObject {
    static String modef = "this is default";
    static private String mopri = "this is private";
    static protected String mopro = "this is protected";
    static public String mopub = "this is public";
    String name;
    public String category;
    protected String director;
    private int year;

    public MovieObject() {
        this.name = "Untitled movie";
        this.category = "A";
        this.director = "John Doe";
        this.year = Calendar.getInstance().get(Calendar.YEAR);
    }
}