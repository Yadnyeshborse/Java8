package StreamAPI.StreamCreate.Builder;

import java.util.stream.Stream;

public class ComplexStreamBuilder {
    public static void main(String[] args) {
        // Create a Stream.Builder
        Stream.Builder<String> builder = Stream.builder();

        // Add elements based on complex logic
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                builder.add("Even: " + i);
            } else {
                builder.add("Odd: " + i);
            }
        }

        // Build the stream
        Stream<String> stream = builder.build();

        // Print the elements
        stream.forEach(System.out::println);
    }
}
