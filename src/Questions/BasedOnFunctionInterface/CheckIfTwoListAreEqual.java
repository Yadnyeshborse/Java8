package Questions.BasedOnFunctionInterface;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class CheckIfTwoListAreEqual {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3);
        List<Integer> list1= Arrays.asList(1,2,3) ;

        BiConsumer<List<Integer>,List<Integer>> result=(list3,list4)->{
            System.out.println(list3.equals(list4)?"True":"false");
        };
        result.accept(list,list1);

    }
}
