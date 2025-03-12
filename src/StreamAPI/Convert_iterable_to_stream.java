package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Convert_iterable_to_stream {
    public static void main(String[] args) {
        // Create an Iterable using Arrays.asList()
        Iterable<Integer> iterable = Arrays.asList(1, 2, 3, 4, 5);

        // Convert the Iterable to a Stream using StreamSupport.stream()
        Stream<Integer> stream = StreamSupport.stream(iterable.spliterator(), false);

        // Print the elements of the stream using forEach()
        stream.forEach(System.out::println);
    }
}