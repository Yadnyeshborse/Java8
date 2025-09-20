package Questions.interviewQuestions;

import java.util.function.Function;
import java.util.stream.Collectors;

public class find_the_first_repeated_character {
    public static void main(String[] args) {
        String name="Hello Worlde";

        char ma=name.
                chars().
                mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().
                stream().
                filter(i->i.getValue()>1).
                map(p->p.getKey()).
                findFirst().get();
        System.out.println(ma);
        System.out.println(20/10);
    }
}
