package StreamAPI.Methods;

import java.util.Arrays;
import java.util.List;

public class ForEachOrdered {
    public static void main(String[] args) {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(10, 19, 20, 1, 2);

        // Using forEachOrdered(Consumer action) to
        // print the elements of stream in encounter order
        list.stream().forEachOrdered(System.out::println);


    }
}
