package StreamAPI;

import java.util.*;

public class Methods_Example {
    public static void main(String[] args) {
        List<Integer> lis= Arrays.asList(1,2,3,4,6);

        Optional<Integer> res=lis.stream().findFirst();
        if (res.isPresent()){
            System.out.println("It is present="+res.get());
        }else {
            System.out.println("It is not present");
        }
        Optional<Integer> res2=lis.stream().findAny();
        System.out.println(res2.get());

        //find min value
        List<Integer> array=Arrays.asList(5,1,3,1,899,46,3);
        Optional<Integer> res3=array.stream().min(Comparator.naturalOrder());
        res3.ifPresent(min->System.out.println("Min value is "+min));

        //find max value
        List<Integer> array1=Arrays.asList(5,1,3,1,899,46,3);
        Optional<Integer> res4=array1.stream().max(Comparator.naturalOrder());
        res4.ifPresent(max->System.out.println("Max value is "+max));
    }
}
