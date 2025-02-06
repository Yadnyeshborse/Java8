package FunctionalInterface.Function.Consumer.BiConsumer;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Print_key_Pair {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",56);
        map.put("Banana",45);
        map.put("Berry",23);

        BiConsumer<String,Integer> printElement=(key,pair)->{
            System.out.println("Keys  "+key+"  Value "+pair);
        };
        map.forEach(printElement);
    }
}
