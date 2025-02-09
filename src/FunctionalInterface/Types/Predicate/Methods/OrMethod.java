package FunctionalInterface.Types.Predicate.Methods;

import java.util.function.Predicate;

public class OrMethod {
    public static void main(String[] args) {
        Predicate<String> hasLength=i->i.length()>3;
        Predicate<String> contain=i->i.contains("a");
        System.out.println(hasLength.or(contain).test("and"));
    }
}
