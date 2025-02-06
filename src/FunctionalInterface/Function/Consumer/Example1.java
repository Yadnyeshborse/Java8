package FunctionalInterface.Function.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        Consumer<List<Integer>> consumer=(input)->input.replaceAll(x->x*2);
        Consumer<List<Integer>> result=(input)->input.forEach((x)->System.out.println(x));
        List<Integer> li= Arrays.asList(1,2,3,4,5);
        consumer.andThen(result).accept(li);
    }
}
