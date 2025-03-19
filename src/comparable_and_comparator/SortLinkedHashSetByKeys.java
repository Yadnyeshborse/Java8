package comparable_and_comparator;

import java.util.LinkedHashSet;
import java.util.TreeSet;

class Manus implements Comparable<Manus> {
    Integer marks;

    Manus(Integer marks) {
        this.marks = marks;
    }

    // Override toString method
    public String toString() {
        return " " + this.marks;
    }

    // Override compareTo method to sort LinkedHashSet in ascending order
    public int compareTo(Manus stu) {
        return this.marks.compareTo(stu.marks);
    }
}

public class SortLinkedHashSetByKeys {
    public static void main(String[] args) {

        // New LinkedHashSet
        LinkedHashSet<Manus> set = new LinkedHashSet<>();

        // Adding elements to the set
        set.add(new Manus(500));
        set.add(new Manus(300));
        set.add(new Manus(400));
        set.add(new Manus(100));
        set.add(new Manus(200));

        // Print Before sort
        System.out.println("Before sorting: " + set);

        // TreeSet to sort LinkedHashSet using Comparable
        TreeSet<Manus> sortedSet = new TreeSet<>(set);

        // Print after sorting
        System.out.println("After sorting: " + sortedSet);
    }
}
