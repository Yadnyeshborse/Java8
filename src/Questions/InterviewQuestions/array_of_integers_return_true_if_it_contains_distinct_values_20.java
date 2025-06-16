package Questions.InterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class array_of_integers_return_true_if_it_contains_distinct_values_20 {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,1,2};
//        List<Integer> list=Arrays.stream(arr).boxed().toList();
//        Map<Integer,Long> res=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(res);
//        Collection<Long> collec=res.values();
//       boolean finalresult= collec.stream().noneMatch(x->x>1);
//       System.out.println(finalresult);

       //short cut
        List<Integer> list=Arrays.stream(arr).boxed().toList();
       boolean ress=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .values().stream().noneMatch(x->x>1);
       System.out.println(ress);
    }
}
