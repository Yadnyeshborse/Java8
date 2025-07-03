package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharater {
    public static void main(String[] args) {
        String input = "Hello, world!";

        Map<Character, Long> frequencyMap = input.chars()
                .filter(ch -> ch != ' ') // <-- filters out spaces
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
//        input.chars() is a method that:
//        Belongs to the String class.
//        Returns an IntStream of Unicode values for each character in the string.
        //It returns an IntStream — a stream of int values — not char or Character types.

        //first get int value of charater from i.chars() than convert that int value to charter by map(i->(char)i)

        frequencyMap.forEach((ch, count) -> System.out.println("'" + ch + "': " + count));

        ////Make each starting character as uppercase

        String inputo = "hello world welcome to java";

        String capitalized = Arrays.stream(inputo.split(" "))
                .map(word -> word.isEmpty() ? word :
                        Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println("Data"+capitalized);


    }
}
