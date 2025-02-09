package FunctionalInterface.Types.Consumer.DoubleConsumr;

import java.util.function.DoubleConsumer;

public class Increment_double_value {
    public static void main(String[] args) {
        Double[] values={1.3,2.6,3.8,9.7,5.7};
        DoubleConsumer consumer=(value -> System.out.println(value+1));
        System.out.println("Increment values");
        for (Double val:values){
            consumer.accept(val);
        }
    }
}
