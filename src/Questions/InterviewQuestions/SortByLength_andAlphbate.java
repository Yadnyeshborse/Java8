package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByLength_andAlphbate {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("apple","as","ac","oppp", "banana", "apple", "orange");
        List<String> result=lista.stream().sorted(Comparator.comparingInt((String i)->i.length()).thenComparing(Comparator.naturalOrder())).toList();
        System.out.println(result);

        //find elemet in straing that apprear  only once and their count
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        List<String> uniqueItems = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)  // only once
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Elements appearing only once: " + uniqueItems);
    }
}
