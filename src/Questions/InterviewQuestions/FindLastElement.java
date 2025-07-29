package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindLastElement {
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,3};

        int value=IntStream.range(0,arr.length).map(i->arr[arr.length-1-i]).findFirst().getAsInt();
        System.out.println(value);

        //this is primitive that why we need to use OptionalInt not Optional<Integer>
        OptionalInt i=Arrays.stream(arr).reduce((a, b)->b);
        System.out.println(i);

    }
}
