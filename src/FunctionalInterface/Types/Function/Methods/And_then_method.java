package FunctionalInterface.Types.Function.Methods;

import java.util.function.Function;

public class And_then_method {
    public static void main(String[] args) {
        // Function which takes in a number and
        // returns half of it
        Function<Integer,Double> res=i->i/2.0;
        // Now triple the output of half function
        res=res.andThen(l->l*10);
        System.out.println(res.apply(10));
    }
}
