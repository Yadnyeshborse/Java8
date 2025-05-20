package Questions.Lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,1,3,6,9,2);

        //by comparator
//       list.sort(Comparator.comparing((a)->a));
//       System.out.println(list);

//        list.sort((a,b)->a.compareTo(b));
//        System.out.println(list);

//        List<Integer> list1=list.stream().sorted().collect(Collectors.toList());
//        System.out.println(list1);

//        list.sort(Comparator.naturalOrder());
//        System.out.println(list);

        list.sort((a,b)->a.compareTo(b));
        System.out.println(list);
    }
}
