package Questions.BasedOnFunctionInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.BiConsumer;

public class Print_Map_Key_value_Pair {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"Ram");
        map.put(2,"Sam");
        map.put(3,"Yam");

        BiConsumer<Integer,String> result=(key,pair)->{
            System.out.println("Keys"+key+" "+"pair"+pair);
        };
        map.forEach(result);
    }
}
