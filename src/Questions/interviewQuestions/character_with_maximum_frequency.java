package Questions.interviewQuestions;

import java.util.Map;
import java.util.stream.Collectors;

public class character_with_maximum_frequency {
    public static void main(String[] args) {
        String name="javadeveloper";

        Character maxChar = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Character with max frequency: " + maxChar);


    }
}
