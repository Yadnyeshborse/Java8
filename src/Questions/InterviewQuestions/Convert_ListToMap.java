package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert_ListToMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        str -> str,           // key: the string itself
                        str -> str.length()   // value: string length
                ));

        System.out.println(map); // {apple=5, banana=6, cherry=6}

    }
}
