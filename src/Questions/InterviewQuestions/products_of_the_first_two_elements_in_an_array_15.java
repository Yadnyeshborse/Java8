package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class products_of_the_first_two_elements_in_an_array_15 {
    public static void main(String[] args) {
        int arr[] = {12, 5, 2, 1, 4, 7, 8};

        int ans = Arrays.stream(arr)
                .boxed()                                  // Convert int to Integer
                .collect(Collectors.toList())             // Collect to List<Integer>
                .stream()                                 // Convert list back to Stream
                .limit(2)                                 // Take first 2 elements: [12, 5]
                .reduce(1, (a, b) -> a * b);              // Multiply: 1 * 12 * 5 = 60

        System.out.println(ans);                     // Output: 60

    }
}
