package pre_defined_functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctiona_by_lambda {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bifuction=(integer,integer2)->(integer+integer2);
        BiFunction<Integer,Integer,Integer> sub=(integer,integer2)->(integer-integer2);
        System.out.println(bifuction.apply(3,4));
        System.out.println(bifuction.apply(9,0));
        System.out.println(sub.apply(100,90));

        Function<Integer,Integer> function=(no)->no*no;
        Integer re=bifuction.andThen(function).apply(100,90);
        System.out.println("Answer is "+re);
        
    }
}
