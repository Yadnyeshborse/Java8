package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintInformat {
    public static void main(String[] args) {
        //Alice=ALICE, Bob=BOB, Charlie=CHARLIE
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Map<String,String> map=names.stream().collect(Collectors.toMap(Function.identity(),o->o.toUpperCase()));
        System.out.println(map);
    }
}
