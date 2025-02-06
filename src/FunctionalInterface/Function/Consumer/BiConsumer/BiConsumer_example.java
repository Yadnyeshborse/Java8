package FunctionalInterface.Function.Consumer.BiConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer_example {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,1,3);
        List<Integer>  list1=Arrays.asList(2,1,3);

        BiConsumer<List<Integer>,List<Integer>> result=(list2,list3)->{
            System.out.println(list2.equals(list3)?"True" :"False");
        };
        result.accept(list,list1);
    }
}
