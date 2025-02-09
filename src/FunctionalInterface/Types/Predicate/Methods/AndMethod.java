package FunctionalInterface.Types.Predicate.Methods;

import java.util.function.Predicate;

public class AndMethod {
    public static void main(String[] args) {
        //and mainly used for chaining two object
        Predicate<Integer> isLessThan=i->i<90;
        Predicate<Integer> isGreaterThan=k->k>50;
        System.out.println(isLessThan.and(isGreaterThan).test(67));
    }
}
