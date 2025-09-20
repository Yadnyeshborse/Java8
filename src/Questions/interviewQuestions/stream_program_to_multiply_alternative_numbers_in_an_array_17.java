package Questions.interviewQuestions;

import java.util.stream.IntStream;

public class stream_program_to_multiply_alternative_numbers_in_an_array_17 {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int ans=IntStream.range(0,arr.length).filter(i->i%2==0).map(x->arr[x]).reduce(1,(a,b)->a*b);
        System.out.println(ans);
    }
}
