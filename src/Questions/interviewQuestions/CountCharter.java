package Questions.interviewQuestions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountCharter {
    public static void main(String[] args) {
        String input = "aaaccdddaa";


        String result = IntStream.range(0, input.length())
                .filter(i -> i == 0 || input.charAt(i) != input.charAt(i - 1))
                .mapToObj(i -> {
                    char ch = input.charAt(i);
                    long count = IntStream.range(i, input.length())
                            .takeWhile(j -> input.charAt(j) == ch)
                            .count();
                    return ch + String.valueOf(count);
                })
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
