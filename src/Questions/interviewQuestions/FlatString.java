package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatString {
    public static void main(String[] args) {
        String[] sentences = {"Java Stream is fun", "It is a powerful tool for data processing"};

        Map<String, Long> result = Arrays.stream(sentences)
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Split each sentence into words
                .map(String::toLowerCase) // Convert to lowercase
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Count frequency

        System.out.println(result);
    }
}
