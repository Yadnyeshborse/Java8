 package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class FindNameStartWithAAndTheirCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ema","Bob","Anna","Alice");
        long count = list.stream()
                .filter(name -> name.startsWith("A"))
                .peek(System.out::println)  // Print each name that passes the filter
                .count();                   // Count them

        System.out.println("Number of names starting with 'A': " + count);


    }
}
