package Questions.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortElement_String {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Zara", "John", "Alice");
       // List<String> list1=list.stream().sorted().collect(Collectors.toList());
       // System.out.println(list1);

        //another way
       // list.sort((a,b)->a.compareTo(b));
        //System.out.println(list);

        //by comparing
//        list.sort(Comparator.comparing((i)->i));
//        System.out.println(list);

        //by natural order
//        list.sort(Comparator.naturalOrder());
//        System.out.println(list);


    }
}
