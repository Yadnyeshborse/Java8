package StreamAPI.StreamConvert;

import java.util.stream.IntStream;

public class IntStreamOf {
    public static void main(String[] args) {
        // Create an IntStream from individual values
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::println);
    }
}
