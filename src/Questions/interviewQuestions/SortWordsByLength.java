package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortWordsByLength {
    public static void main(String[] args) {
        String input = "Java is Amazing and";

        String result = Arrays.stream(input.split("\\s+"))
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(" "));

        System.out.println(result);   // is and Java Amazing

    }
}
