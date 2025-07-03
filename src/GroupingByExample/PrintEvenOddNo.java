package GroupingByExample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintEvenOddNo {
    public static void main(String[] args) {
        Map<String, List<Integer>> map= IntStream.rangeClosed(0,100).boxed().collect(Collectors.groupingBy((i)->i%2==0?"even":"odd"));
        System.out.println(map);
    }
}
