package lamda_in_depth.Sorting_Ways;

import java.util.TreeSet;

public class Sort_linkedlist {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after sorting are: " + h);
    }
}
