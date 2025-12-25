package Questions.interviewQuestions;

import java.util.stream.Collectors;
import java.util.*;

public class SecondMostRepeatingCharater {
    public static void main(String[] args) {
        String s = "swiss";  // p=2, a,l,e=1 → second most = a (or l or e)

        Optional<Map.Entry<Character, Long>> second =
                s.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue())) // sort by freq desc
                        .skip(1)  // skip the highest repeating
                        .findFirst(); // second most frequent

        second.ifPresentOrElse(
                e -> System.out.println("Second most repeating: " + e.getKey() + " = " + e.getValue()),
                () -> System.out.println("Not enough characters")
        );
    }
}
