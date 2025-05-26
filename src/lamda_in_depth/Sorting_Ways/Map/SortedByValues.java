package lamda_in_depth.Sorting_Ways.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedByValues {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Sam");
        map.put(2,"Arab");
        map.put(3,"Zebra");

        Map<Integer,String> sortedArray;
        sortedArray=map.entrySet()
                .stream()
                .sorted((entry1,entry2)->entry1.getValue().compareTo(entry2.getValue()))
                .collect(Collectors.toMap(
                        entry->entry.getKey(),
                        entry->entry.getValue(),
                        (e1,e2)->e1,
                        ()->new LinkedHashMap<Integer,String>()
                ));
        System.out.println(sortedArray);
        //Always use LinkedHashMap::new in Collectors.toMap() to preserve the sorted order.
        //If you want a naturally sorted map by key, you can use TreeMap:
    }
}
