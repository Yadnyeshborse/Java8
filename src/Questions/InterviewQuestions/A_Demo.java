package Questions.InterviewQuestions;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Demo {
    public static void main(String[] args) {

        String as="adgsdsadadh";
        String ans=Arrays.stream(as.split("")).distinct().collect(Collectors.joining(""));
        System.out.println(ans);
    }
}
