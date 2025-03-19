package comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Data {
    private int y;
    private String n; // Movie name
    private double r; // Movie rating

    public String getN() {
        return n;
    }
    public double getR() {
        return r;
    }
    public int getY() {
        return y;
    }
    public Data(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }
}

public class Comparator_Method {
    public static void main(String[] args) {
        ArrayList<Data> m = new ArrayList<>();
        m.add(new Data("Force Awakens", 8.3, 2015));
        m.add(new Data("Star Wars", 8.7, 1977));
        m.add(new Data("Empire Strikes Back", 8.8, 1977));

        // Sorting using a Comparator instance
        //Collections.sort(m, new RatingComparator());

        //sort by tear and rating both
        Collections.sort(m,new SortByRatingByYear());

        // Printing sorted data
        for (Data d : m) {
            System.out.println(d.getN() + " - " + d.getR());
        }
    }
}

// Separate Comparator class
class RatingComparator implements Comparator<Data> {
    @Override
    public int compare(Data o1, Data o2) {
        return Double.compare(o1.getR(), o2.getR());
    }
}

class SortByRatingByYear implements Comparator<Data>{

    @Override
    public int compare(Data o1, Data o2) {
        int yearCompare=Integer.compare(o1.getY(),o2.getY());
        if (yearCompare==0){
            return Double.compare(o1.getR(),o2.getR());
        }
        return yearCompare;
    }
}
