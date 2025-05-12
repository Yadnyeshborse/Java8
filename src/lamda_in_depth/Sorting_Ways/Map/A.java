package lamda_in_depth.Sorting_Ways.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(3,"Raj");
        map.put(2,"Sam");
        map.put(1,"Aar");

        Map<Integer,String> sortedArray;
        sortedArray=map.entrySet().
                stream().
                sorted((entry1,entry2)->entry1.getKey().compareTo(entry2.getKey())).
                collect(Collectors.toMap(
                        entry->entry.getKey(),
                        entry->entry.getValue(),
                        (e1,e2)->e1,
                        ()->new LinkedHashMap<Integer,String>()
                        )
                );
        System.out.println(sortedArray);


    }
}
