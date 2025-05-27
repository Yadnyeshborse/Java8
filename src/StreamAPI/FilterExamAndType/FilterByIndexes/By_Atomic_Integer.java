package StreamAPI.FilterExamAndType.FilterByIndexes;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class By_Atomic_Integer {
    public static void main(String[] args) {
        // Input array
        String[] array = {"stream", "is", "a",
                "sequence", "of", "elements",
                "like", "list"};

        //

        // Use AtomicInteger to track the index
        AtomicInteger index = new AtomicInteger(0);

        // Create a stream from the array
        Stream<String> mystream = Arrays.stream(array);

        // Filter elements by index and print them
        mystream.filter(str -> {
                    int currentIndex = index.getAndIncrement();
                    return currentIndex % 2 == 0; // Filter even-indexed elements
                })
                .forEach(System.out::println);
    }
}