package FunctionalInterface.Types.Function.Questions;

import java.util.function.Function;

public class ExceptionResult {
    public static void main(String[] args) {
        Function<Integer, Double> res = i -> i / 2.0;

        try {
            res = res.andThen(null);
        } catch (NullPointerException e) {
            System.out.println("Custom Message: andThen function received a null value.");
            e.printStackTrace();
        }

        System.out.println(res.apply(10));
    }
}
