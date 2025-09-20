package Questions.interviewQuestions;

import java.util.Arrays;

public class Remove_duplicates_from_the_string_and_return_in_the_same_order {
    public static void main(String[] args) {
        String as="adgsdsadadh";
        as.chars().distinct().mapToObj(c->(char)c).forEach(i->System.out.println(i));

        //another war

        Arrays.stream(as.split(" ")).distinct().forEach(o->System.out.println(o));
    }
}
