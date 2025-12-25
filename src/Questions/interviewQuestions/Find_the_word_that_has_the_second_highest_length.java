package Questions.interviewQuestions;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find_the_word_that_has_the_second_highest_length {
    public static void main(String[] args) {
        String ast="Hi I am learnng java";
        String res=Arrays.stream(ast.split(" "))
                .sorted(Comparator.comparing((String s) -> s.length())
                        .reversed())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("first=" + res);

        List<Integer> list=Arrays.asList(1000,7990,2000);
        Optional<Integer> first = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first.get());

    }
}
