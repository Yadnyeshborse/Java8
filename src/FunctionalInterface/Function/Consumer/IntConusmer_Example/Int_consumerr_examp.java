package FunctionalInterface.Function.Consumer.IntConusmer_Example;

import java.util.function.IntConsumer;

public class Int_consumerr_examp {
    public static void main(String[] args) {
        IntConsumer consumer=a->System.out.println(a*10);
        consumer.accept(3);
    }
}
