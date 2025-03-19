package comparable_and_comparator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class KL implements Comparable<KL> {
    String name;

    KL(String name) {
        this.name = name;
    }

    // Override toString method
    public String toString() {
        return this.name;
    }

    // Override compareTo method to sort LinkedHashMap keys
    public int compareTo(KL other) {
        return this.name.compareTo(other.name);
    }
}

public class SortLinkedHashMapByKey {
    public static void main(String[] args) {
        // New LinkedHashMap
        LinkedHashMap<KL, Integer> map = new LinkedHashMap<>();

        // Adding elements to the map
        map.put(new KL("Bina"), 200);
        map.put(new KL("Akshay"), 400);
        map.put(new KL("Chintu"), 500);

        // Print Before sort
        System.out.println("Before sorting: " + map);

        // TreeMap to sort LinkedHashMap using Comparable
        TreeMap<KL, Integer> sortedMap = new TreeMap<>(map);

        // Print after sorting
        System.out.println("After sorting: " + sortedMap);
    }
}
