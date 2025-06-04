package GroupingByExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEvenOddNo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<String,List<Integer>> map=numbers.stream().collect(Collectors.groupingBy(n->n%2==0?"even":"odd"));
        System.out.println(map);

    }
}
