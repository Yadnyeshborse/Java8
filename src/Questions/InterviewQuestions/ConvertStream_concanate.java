package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ConvertStream_concanate {
    public static void main(String[] args) {
        //Convert a list of string to uppercase and then concatenate
        List<String> list= Arrays.asList("a","b","c");
        String an=list.stream().map(x->x.toUpperCase()).reduce((a,b)->a+" "+b).orElse(" ");
        System.out.println(an);
    }
}
