package lamda_in_depth.Sorting_Ways;


import java.util.Arrays;
import java.util.List;

public class Best_ways {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(205, 102, 98, 275, 203);
        al.sort((o1, o2) -> Integer.compare(o2, o1)); // Sorting in descending order
        System.out.println("Sorted ArrayList: " + al);
    }
}
