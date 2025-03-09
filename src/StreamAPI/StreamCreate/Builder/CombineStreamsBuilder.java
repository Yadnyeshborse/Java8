package StreamAPI.StreamCreate.Builder;

import java.util.stream.Stream;

public class CombineStreamsBuilder {
    public static void main(String[] args) {
        // Create a Stream.Builder
        Stream.Builder<String> builder = Stream.builder();

        // Add elements from multiple sources
        Stream<String> stream1 = Stream.of("A", "B", "C");
        Stream<String> stream2 = Stream.of("X", "Y", "Z");

        // Add elements from stream1
        stream1.forEach(builder::add);

        // Add elements from stream2
        stream2.forEach(builder::add);

        // Build the combined stream
        Stream<String> combinedStream = builder.build();

        // Print the elements
        combinedStream.forEach(System.out::println);
    }
}
