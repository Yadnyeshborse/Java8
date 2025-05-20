package lamda_in_depth.Sorting_Ways;


import java.util.Arrays;
import java.util.List;

public class SortInteger {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(205, 102, 98, 275, 203);
        al.sort((o1, o2) -> Integer.compare(o2,o1)); // Sorting in descending order
        System.out.println("Sorted List: " + al);
        //Use Integer.compare(o1, o2) when you're comparing primitive values or want a more explicit, static method — it's often preferred in streams and lambda expressions.

        //Use o1.compareTo(o2) when you're comparing objects that implement Comparable (e.g., String, LocalDate, custom objects).
    }
}
