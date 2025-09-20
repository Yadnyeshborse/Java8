package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class AverageOfNo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,5);
        Double ans=list.stream().mapToDouble(integer -> integer.intValue()).average().getAsDouble();
        System.out.println(ans);
    }
}
