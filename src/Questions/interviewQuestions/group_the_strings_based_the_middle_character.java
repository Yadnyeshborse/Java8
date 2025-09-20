package Questions.interviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class group_the_strings_based_the_middle_character {
    public static void main(String[] args) {
        String atr[]={"wer","wer","lsk","pos","psm"};

        System.out.println(Stream.of(atr).collect(Collectors.groupingBy(x->x.toString().substring(1,2))));
    }
}
