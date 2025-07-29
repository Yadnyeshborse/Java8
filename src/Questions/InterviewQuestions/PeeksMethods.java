package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class PeeksMethods {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "kafka");
        List<String> list1=list.stream().filter(i->i.length()>1).
                peek(s->System.out.println(s)).map(String::toUpperCase).
                peek(i->System.out.println(i)).toList();
        System.out.println(list1);

    }
}
