package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfIntToSquare {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        List<Integer> list1=list.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(list1);

        //map does not modify original elements it return new element
    }
}
