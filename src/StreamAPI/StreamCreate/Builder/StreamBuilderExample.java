package StreamAPI.StreamCreate.Builder;

import java.util.stream.Stream;

public class StreamBuilderExample {
    public static void main(String[] args) {
        // Create a Stream.Builder
        Stream.Builder<String> builder = Stream.builder();

        // Add elements conditionally
        builder.add("Hello");
        if (args.length > 0) {
            builder.add(args[0]); // Add a command-line argument if it exists
        }
        builder.add("World");

        // Build the stream
        Stream<String> stream = builder.build();

        // Print the elements
        stream.forEach(System.out::println);
    }
}
