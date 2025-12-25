package Questions.interviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {


                String input = "Hello Yadnyesh";

                String reversed = IntStream.range(0, input.length())
                        .mapToObj(i -> input.charAt(input.length() - 1 - i))
                        .map(String::valueOf)
                        .collect(Collectors.joining());

                System.out.println(reversed);

        String reversedp = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> b + a);
        System.out.println(reversedp);



    }
}

