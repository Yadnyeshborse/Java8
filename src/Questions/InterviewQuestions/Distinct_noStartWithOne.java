package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Distinct_noStartWithOne {
    public static void main(String[] args) {
        int arr[]={122,23,44,11,34,78,54,1,632,3,123,19};
        Arrays.stream(arr).
                distinct().
                filter(x->String.valueOf(x).startsWith("1")).
                boxed().sorted((a,b)->b-a).collect(Collectors.toList()).forEach(System.out::println);

    }
}
