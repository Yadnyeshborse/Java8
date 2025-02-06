package FunctionalInterface.Function.Consumer.BiConsumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class Merge_twolist_intoMap {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Rahul","Manish","Kety");
        List<Integer> list1=Arrays.asList(23,65,21);
        Map<String ,Integer> outcome=new HashMap<>();

        BiConsumer<List<String>,List<Integer>> result=(a,b)->{
            for (int i=0;i<a.size();i++){
                System.out.println(a.get(i)+" "+b.get(i));
            }
        };
        result.accept(list,list1);

    }
}
