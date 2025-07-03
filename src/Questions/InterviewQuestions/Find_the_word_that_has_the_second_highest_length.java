package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Find_the_word_that_has_the_second_highest_length {
    public static void main(String[] args) {
        String ast="Hi I am learnng java";
        String res=Arrays.stream(ast.split(" ")).sorted(Comparator.comparing((String s) -> s.length()).reversed()).skip(1).findFirst().get();
        System.out.println("first=" + res);

        int ans=Arrays.stream(ast.split(" ")).map(u->u.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(ans);
    }
}
