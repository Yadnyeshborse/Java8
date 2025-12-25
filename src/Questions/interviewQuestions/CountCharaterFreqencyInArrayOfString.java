package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharaterFreqencyInArrayOfString {
    public static void main(String[] args) {
        String[] sentences = {"Java Stream is fun", "It is a powerful tool for data processing"};
        Map<String, Long> collect = Arrays.stream(sentences).flatMap(i -> Arrays.stream(i.split(" ")))
                .map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);
    }
}
