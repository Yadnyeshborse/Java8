package StreamAPI.StreamCreate.Builder;

import java.util.stream.Stream;

public class Conditional {
    public static void main(String[] args) {
        // Create a Stream.Builder
        Stream.Builder<Integer> builder = Stream.builder();

        // Add elements conditionally
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                builder.add(i); // Add only even numbers
            }
        }

        // Build the stream
        Stream<Integer> stream = builder.build();

        // Print the elements
        stream.forEach(System.out::println);
    }
}
