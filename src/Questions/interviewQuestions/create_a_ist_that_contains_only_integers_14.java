package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class create_a_ist_that_contains_only_integers_14 {
    public static void main(String[] args) {
        String[]  s={"abc","123","xyz","678"};
        List<Integer> list= Arrays.stream(s).filter(as->as.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list);

//        String s = "123";
//        Integer i = Integer.valueOf(s); // i is 123 (as Integer object)

    }
}
