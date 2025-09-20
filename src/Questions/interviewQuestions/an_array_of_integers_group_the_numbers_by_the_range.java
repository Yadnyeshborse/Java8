package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class an_array_of_integers_group_the_numbers_by_the_range {
    public static void main(String[] args) {
        int arr[]={2,6,12,18,23,24,32,37,45,49,52,59};

        List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());
       // System.out.println(list);
         Map<Integer,List<Integer>> map =list
                 .stream()
                 .collect(Collectors.groupingBy(x->x/10*10,Collectors.toList()));
         System.out.println(map);

    }
}
