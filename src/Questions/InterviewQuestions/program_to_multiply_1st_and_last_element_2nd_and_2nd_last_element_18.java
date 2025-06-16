package Questions.InterviewQuestions;

import java.util.stream.IntStream;

public class program_to_multiply_1st_and_last_element_2nd_and_2nd_last_element_18 {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,8};
        IntStream.range(0, arr.length/2).map(x->arr[x]*arr[arr.length-x-1]).forEach(System.out::println);
    }
}
