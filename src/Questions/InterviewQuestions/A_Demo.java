package Questions.InterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class A_Demo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,2,2};
        System.out.println(Arrays.toString(arr));
        int res=Arrays.stream(arr).distinct().sum();
        OptionalInt i=Arrays.stream(arr).distinct().reduce((a, b)->a+b);
        System.out.println(i.getAsInt());
    }
}
