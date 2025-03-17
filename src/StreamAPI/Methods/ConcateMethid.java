package StreamAPI.Methods;

import java.util.stream.Stream;

public class ConcateMethid {
    public static void main(String[] args) {
        // Creating two Streams
        Stream<String> streamp1 = Stream.of("Geeks", "for");
        Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks");

        // concatenating both the Streams
        // with Stream.concat() function
        // and displaying the result
        Stream.concat(streamp1, stream2)
                .forEach(element -> System.out.println(element));

        // Creating more than two Streams
        Stream<String> streamo1 = Stream.of("Geeks");
        Stream<String> streamo2 = Stream.of("GeeksQuiz");
        Stream<String> stream3 = Stream.of("GeeksforGeeks");
        Stream<String> stream4 = Stream.of("GFG");

        // concatenating all the Streams
        // with Stream.concat() function
        // and displaying the result
        Stream.concat(Stream.concat(Stream.concat(streamo1,
                        streamo2), stream3), stream4)
                .forEach(element -> System.out.println(element));

        // Creating two Streams
        Stream<String> strea1 = Stream.of("Geeks", "for", "GeeksforGeeks");
        Stream<String> strea2 = Stream.of("GeeksQuiz", "GeeksforGeeks", "for");

        // concatenating both the Streams
        // with Stream.concat() function
        // and displaying the result after
        // removing the duplicates
        Stream.concat(strea1, strea2).distinct().forEach(element -> System.out.println(element));
    }
}
