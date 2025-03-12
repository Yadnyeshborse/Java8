package Questions.StramAPI;


import java.util.stream.Stream;

public class PrintSecondCharater {
    public static void main(String[] args) {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("GFG", "Geeks",
                "for", "GeeksforGeeks");
        // Using forEachOrdered(Consumer action)
        stream.flatMap(i->Stream.of(i.charAt(2))).forEach(System.out::println);

    }
}
