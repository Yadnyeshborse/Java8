package comparable_and_comparator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.*;

public class SortLinkedHashMap {
        public static void main(String[] args) {
            LinkedHashMap<String, Integer> l_map = new LinkedHashMap<>();
            l_map.put("Computer", 1);
            l_map.put("Science", 3);
            l_map.put("Portal", 2);

            System.out.println("Before Sorting: " + l_map);

            // Convert map to list and sort by value
            List<Map.Entry<String, Integer>> list = new ArrayList<>(l_map.entrySet());
            list.sort(Map.Entry.comparingByValue());

            // Put sorted values back in LinkedHashMap
            LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            System.out.println("After Sorting: " + sortedMap);
        }

}
