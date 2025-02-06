package FunctionalInterface.Function.Consumer.BiConsumer;

import java.util.function.BiConsumer;

public class Combined_two_Strring {
    public static void main(String[] args) {
        BiConsumer<String,String> result=(S1,S2)->{
            System.out.println(S1+" "+S2);
        };
        result.accept("Hello","World");
    }
}
