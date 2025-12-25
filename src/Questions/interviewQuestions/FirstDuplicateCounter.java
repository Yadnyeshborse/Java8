package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class FirstDuplicateCounter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 2, 2);

        Optional<Integer> result = numbers.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,       // preserve order
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1) // find duplicates
                .map(Map.Entry::getKey)        // get key
                .findFirst();// pick first duplicate

        System.out.println(result.orElse(null)); // Output: 2
    }
}
