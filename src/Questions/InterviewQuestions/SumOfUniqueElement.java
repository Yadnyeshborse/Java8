package Questions.InterviewQuestions;

import java.util.Arrays;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,3,2,1,4,7,8};
        int res=Arrays.stream(arr).distinct().sum();
        System.out.println(res);
    }
}
