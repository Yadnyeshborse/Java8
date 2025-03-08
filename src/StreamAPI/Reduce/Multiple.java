package StreamAPI.Reduce;

import java.util.List;

public class Multiple {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4);
        int result=list.stream().reduce(1,(a,b)->a*b);
        System.out.println(result);
    }
}
