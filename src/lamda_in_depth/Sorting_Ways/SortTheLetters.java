package lamda_in_depth.Sorting_Ways;

import java.util.Arrays;
import java.util.List;

public class SortTheLetters {
    public static void main(String[] args) {
        List<String>  list= Arrays.asList("Raj","Swami","Rahul","Shivay");
        list.sort((a,b)->b.compareTo(a));
        System.out.println(list);
    }
}
