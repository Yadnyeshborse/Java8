package StreamAPI.StreamCreate;

import java.util.List;
import java.util.stream.Stream;

public class SortedArray {
    public static void main(String[] args) {
        List<Integer> list= List.of(2,5,1,8,9,4,3,3,3,3,3);
        list.stream().sorted().distinct().forEach(System.out::println);
    }
}
