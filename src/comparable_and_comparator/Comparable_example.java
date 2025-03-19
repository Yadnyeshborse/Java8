package comparable_and_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Movie implements Comparable<Movie>{
    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    private String n;
    private double r;
    private int y;

    public String getN() {
        return n;
    }
    public double getR() {
        return r;
    }
    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Movie o) {
        return this.y-o.y;
    }
}
public class Comparable_example {
    public static void main(String[] args) {
        ArrayList<Movie> list=new ArrayList<>();
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);
        System.out.println("Sorting By movie year");
        for (Movie movie:list){
            System.out.println(movie.getN()+" "+movie.getR()+" "+movie.getY());
        }
        //Collections.sort() is a utility method in Java that sorts a list of objects. However,
        // for Collections.sort() to work, it needs to know how to compare the objects in the list. This is where compareTo comes into play.
        //ava internally uses the compareTo method (defined in the Movie class) to compare the objects and sort the list.
        //Can we use one without the other?
        //No, because Collections.sort() relies on the compareTo method to know how to sort the objects.
        //
        //If you don’t implement compareTo, Java won’t know how to compare the objects, and Collections.sort() will throw an error.
    }


}
