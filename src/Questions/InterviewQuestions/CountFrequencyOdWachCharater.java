package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOdWachCharater {
    public static void main(String[] args) {
        String input = "Hello, world!";

        Map<Character, Long> frequencyMap = input.chars()
                .filter(ch -> ch != ' ') // <-- filters out spaces
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        frequencyMap.forEach((ch, count) -> System.out.println("'" + ch + "': " + count));

        ////

        String inputo = "hello world welcome to java";

        String capitalized = Arrays.stream(inputo.split(" "))
                .map(word -> word.isEmpty() ? word :
                        Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(capitalized);
    }
}
