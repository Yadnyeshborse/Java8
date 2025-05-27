package Questions.BasedOnFunctionInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MergeTwoArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3);
        List<String> list1=Arrays.asList("Rahul","Sunny","Bobby");
        Map<Integer,String> map=new HashMap<>();

        BiConsumer<List<Integer>,List<String>> data=(l1,l2)->{
            for (int i=0;i<list1.size();i++){
                System.out.println(l1.get(i)+" "+l2.get(i));
            }
        };
        data.accept(list,list1);
    }
}
