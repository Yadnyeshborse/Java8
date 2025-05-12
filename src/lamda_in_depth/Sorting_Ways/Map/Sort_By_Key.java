package lamda_in_depth.Sorting_Ways.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort_By_Key {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        Map<Integer, String> sortedByKey;
        sortedByKey = map.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (e1, e2) -> e1,   //This is called the merge function  It's a lambda expression that tells what to do when two entries have the same key (i.e., a key collision) during collection.
                        () -> new LinkedHashMap<Integer, String>()
                ));

        System.out.println(sortedByKey); // {1=A, 2=B, 3=C}

        //hashMap does not maintain insertion order so element will be in unsorted order
        //linked hashmap will maintain insertion order
        // that why in start we used HashMap and at last we used LinkedHashMap
    }
}
