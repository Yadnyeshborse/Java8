package FunctionalInterface.Types.Predicate.Methods;

import java.util.function.Predicate;

public class IsEqualMethod {
    public static void main(String[] args) {
        Predicate<Integer> islessThan=i->i<90;
        System.out.println(islessThan.test(5));
    }
}
