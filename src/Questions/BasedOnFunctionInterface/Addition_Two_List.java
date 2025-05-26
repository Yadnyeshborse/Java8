package Questions.BasedOnFunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Addition_Two_List {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4);
        List<Integer> list1=Arrays.asList(6,7,8);
        List<Integer> resu=new ArrayList<>();

        BiConsumer<List<Integer>,List<Integer>> result=(l1,l2)->{
            for (int i=0;i<l1.size();i++){
                resu.add(l1.get(i)+l2.get(i));
            }
        };
        result.accept(list,list1);
        System.out.println(resu);
    }
}
