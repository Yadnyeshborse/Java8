package StreamAPI.Reduce;

import java.util.List;

public class SumByReduce {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,4,5,6,7);
        int sum=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
