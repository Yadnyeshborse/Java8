package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ReduceOperation {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("france","India","Italy","US","UK");
        //reduce is terminal operation
        //it reduce element into single element
        //reduce(...) returns Optional<Integer>, not a String.

        //find longest string
        Optional<String> aDouble=list.stream().reduce((o1, o2)->o1.length()>o2.length()?o1:o2);
        System.out.println(aDouble.get());

        //combine element
        Optional<String> optional=list.stream().reduce((o1,o2)->o1+" "+o2);
        System.out.println(optional.get());

        //find sum
        List<Integer> list1= Arrays.asList(1,3,4,5,6,7,8);
        Optional<Integer> result=list1.stream().reduce((num1,num2)->num1+num2);
        System.out.println(result.get());
    }
}
