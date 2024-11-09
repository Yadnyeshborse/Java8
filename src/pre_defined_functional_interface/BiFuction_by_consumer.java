package pre_defined_functional_interface;

import java.util.function.BiConsumer;

public class BiFuction_by_consumer {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumerAdd=(a,b)->System.out.println(a+b);
        BiConsumer<Integer,Integer> biConsumerSub=(a,b)->System.out.println(a+b);
        BiConsumer<Integer,Integer> biConsumerMul=(a,b)->System.out.println(a+b);
        BiConsumer<Integer,Integer> biConsumerDivide=(a,b)->System.out.println(a+b);
        biConsumerAdd.accept(2,3);
        biConsumerSub.accept(66,9);
        biConsumerMul.accept(34,78);
        biConsumerDivide.accept(200,10);
    }
}
