package Questions.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class program_to_move_all_zeros_to_beginning_of_array_19 {
    public static void main(String[] args) {
        int arr[]={5,0,1,21,3,5,0};
        List<Integer> list= Arrays.stream(arr).boxed().toList();

        List<Integer> list1=list.stream().filter(x->x%2==0).toList();
        List<Integer> list2=list.stream().filter(x->x%2!=0).toList();

        List<Integer> lastfinal=new ArrayList<>();
        lastfinal.addAll(list1);
        lastfinal.addAll(list2);
        System.out.println(lastfinal);

        //second way
        Map<Boolean,List<Integer>> result=list.stream().collect(Collectors.partitioningBy(x->x!=0));
        System.out.println(result);

        //optimized
        List<Integer> ans=list.stream().
                collect(Collectors.partitioningBy(x->x!=0)).  // // Partition the list into two groups: non-zero (true) and zero (false)
                values().stream().   //   Get the values (2 lists) from the partitioned map
                flatMap(x->x.stream()).   //Flatten the two lists (non-zero first, then zeros) into one strea
                collect(Collectors.toList());   //Collect the flattened stream back into a list
        System.out.println(ans);



    }
}
