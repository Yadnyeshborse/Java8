package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,8);
//        Optional<Integer> integer=list.stream().reduce((a, b)->a+b);
//        System.out.println(integer);

        int sum=list.stream().mapToInt(integer -> integer.intValue()).sum();  //here converting from intger to int
        System.out.println(sum);
    }
}
