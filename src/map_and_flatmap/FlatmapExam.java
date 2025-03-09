package map_and_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatmapExam {
    public static void main(String[] args) {
        // Create a nested list
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(5, 6));
        list.add(Arrays.asList(7, 8));

        //we do not want in form of stream of seam of data i.e in for of list of list so we use flatmap
        // Print the nested lists as they are
//        System.out.println("Nested Lists:");
//        for (List<Integer> innerList : list) {
//            System.out.println(innerList);
//        }

        list.stream().flatMap(i->i.stream()).forEach(System.out::println);
    }
}