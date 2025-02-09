package FunctionalInterface.Types.Function.Methods;

import java.util.function.Function;

public class And_method {
    public static void main(String[] args) {
        //This method takes in only one parameter t which is the function argument
        Function<Integer,Double> result=a->a/2.0;
        System.out.println(result.apply(10));
    }
}
