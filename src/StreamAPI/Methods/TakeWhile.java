package StreamAPI.Methods;

import java.util.Arrays;
import java.util.List;

public class TakeWhile {
    public static void main(String[] args) {
        List<Integer>  list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().takeWhile(i->i<5).forEach(System.out::println);

        //-----------------------------
    }
}
