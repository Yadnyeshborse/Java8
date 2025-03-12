package StreamAPI.StreamConvert;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors; ;

public class Convert_Stream_to_Set_toJava {
    // Driver code
    public static void main(String[] args) {

        // Creating a Stream of Integers
        Stream<Integer> stream = Stream.of(-2, -1, 0, 1, 2);

        // Using Stream.collect() to collect the
        // elements of stream in a container.
        Set<Integer> streamSet = stream.collect(Collectors.toSet());

        // Displaying the elements
        streamSet.forEach(num -> System.out.println(num));
    }
}
