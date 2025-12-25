package Questions.interviewQuestions;

import java.util.function.Function;
import java.util.stream.Collectors;

public class GoupDataUsingFrequency {
    public static void main(String[] args) {
       // input : apple a-1 p-2 l-1 e-1
//        output: ppale
//        String name="apple";

        String name="apple";
        String list = name.chars().mapToObj(i -> (char) i).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2)->Long.compare(e2.getValue(),e1.getValue()))
                .map(i -> String.valueOf(i.getKey()).repeat(i.getValue().intValue()))
                .collect(Collectors.joining());
        System.out.println(list);
    }
}
