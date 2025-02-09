package FunctionalInterface.Types.Predicate.Methods;

import java.util.function.Predicate;

public class Predicate_And {

    public static Predicate<String> lengthSize=(i)->i.length()>10;
    public static Predicate<String> checkIfEmpty=(o)->o.isEmpty();

    public static void predicate_main(String data){

        Predicate<String> result=lengthSize.or(checkIfEmpty).negate();
        Boolean res=result.test(data);
        System.out.println(res);
    }

    public static void main(String[] args) {
        predicate_main("Raj");
    }

}
