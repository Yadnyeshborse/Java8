package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intersection_of_two_lists_using_Java_streams {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,5,6);
        List<Integer> list1=Arrays.asList(1,2,3,5,56);
        List<Integer> list2=list.stream().filter(o -> list1.contains(o)).collect(Collectors.toList());
        System.out.println(list2);
    }
}
