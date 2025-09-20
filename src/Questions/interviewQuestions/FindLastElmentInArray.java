package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindLastElmentInArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,6,1,3);


        //by reduce
        Optional<Integer> i =list.stream().reduce((first, second)->second);
        System.out.println(i.get());

        //
    }
}
