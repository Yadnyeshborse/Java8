package FunctionalInterface.Function.Consumer.BiConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Example1_Add_two_list {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4);
        List<Integer> list1=Arrays.asList(6,7,8,9);
        List<Integer> result=new ArrayList<>();

        BiConsumer<List<Integer>,List<Integer>> addElement=(l1,l2)->{
            for (int i=0;i< l1.size();i++){
                result.add(l1.get(i)+l2.get(i));
            }
        };
        addElement.accept(list,list1);
        System.out.println(result);
    }
}
