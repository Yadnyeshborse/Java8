package StreamAPI.StreamCreate.Builder;

import java.util.stream.Stream;

public class IncrementBased {
    public static void main(String[] args) {
        // Create a Stream.Builder
        Stream.Builder<String> builder = Stream.builder();

        // Add elements incrementally
        for (int i = 1; i <= 5; i++) {
            builder.add("Element" + i);
        }

        // Build the stream
        Stream<String> stream = builder.build();

        // Print the elements
        stream.forEach(System.out::println);
    }
}
