package FunctionalInterface.Types.Consumer.BiConsumer;

import java.util.function.BiConsumer;

public class Chaining_biConsumer_andThen {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> addition=(a,b)->{
            System.out.println("Addition="+(a+b));
        };
        BiConsumer<Integer,Integer> mult=(c,d)->{
            System.out.println("Multiplication = "+c*d);
        };

        BiConsumer<Integer,Integer> result=addition.andThen(mult);
        result.accept(2,4);
    }
}
