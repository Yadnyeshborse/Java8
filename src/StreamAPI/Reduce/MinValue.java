package StreamAPI.Reduce;

import java.util.List;

public class MinValue {
    public static void main(String[] args) {
        List<Integer> list=List.of(90,2,1,4,6,3,688,44);
        int min=list.stream().reduce(Integer.MAX_VALUE,(a,b)->b>a?a:b);
        System.out.println(min);
    }
}
