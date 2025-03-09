package Questions.StramAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintEevenElementlessThanTwenty {
    public static void main(String[] args) {
        var stra= IntStream.rangeClosed(1,20);
        stra.filter(o->o%2==0).filter(num->num<10).forEach(System.out::println);
    }
}
