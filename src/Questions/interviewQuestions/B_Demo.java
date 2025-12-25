package Questions.interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B_Demo {
    public static void main(String[] args) {

        IntStream.range(3,10).filter(i->isBoxed(i)).forEach(System.out::println);
    }

    private static boolean isBoxed(int i) {
        return  IntStream.range(2, (int) Math.sqrt(i)).anyMatch(o->i%o==0);
    }

}
