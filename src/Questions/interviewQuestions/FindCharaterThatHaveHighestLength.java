package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FindCharaterThatHaveHighestLength {
    public static void main(String[] args) {
        String  str="I am learning api in java java";

        String result=Arrays.stream(str.split(" ")).max(Comparator.comparing(s -> s.length())).get();
        System.out.println(result);

    }
}
