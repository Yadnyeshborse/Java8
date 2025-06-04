package GroupingByExample;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> gurupByEl=Arrays.asList("Alice", "Bob", "Charlie", "Amanda", "Brian", "Chad");

        Map<Character,List<String>> group=gurupByEl.stream().collect(Collectors.groupingBy((i)->i.charAt(0)));
        group.forEach((key,value)->System.out.println(key+"->"+value));


    }
}
