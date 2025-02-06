package FunctionalInterface.Function.Consumer;

import java.util.function.Consumer;

public class Consumer_with_andThen_method {
    public static void main(String[] args) {
        Consumer<String> part1=(String input)->System.out.println(input.toUpperCase());
        Consumer<String> part2=(String input)->System.out.println(input.length());
        Consumer<String> thirdCosumer=(String input)->System.out.println("To lowercase="+input.toUpperCase());

        Consumer<String> part3=part1.
                andThen(part2).
                andThen(thirdCosumer);
        part3.accept("Hello world");
    }
}
