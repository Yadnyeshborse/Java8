package FunctionalInterface.Types.Consumer.BiConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Comparing_two_list {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3);
        List<Integer> list2=Arrays.asList(6,7,8);

        BiConsumer<List<Integer>,List<Integer>> result=(a,b)->{
       System.out.println(     "Comparing result="+a.equals(b));
        };
        result.accept(list,list2);
    }
}
