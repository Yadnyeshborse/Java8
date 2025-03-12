package StreamAPI.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7);
        Optional<Integer> answer=list.stream().findAny();
        if (answer.isPresent()) {
            System.out.println(answer.get());
        }
        else {
            System.out.println("no value");
        }

        //_______________________________________________________________

        IntStream stream
                = IntStream.of(4, 5, 8, 10, 12, 16).parallel();

        // Using Stream findAny().
                // Executing the source code multiple times
                // may not return the same result.
                // Every time you may get a different
                // Integer which is divisible by 4.

        stream = stream.filter(i -> i % 4 == 0);

        OptionalInt answero = stream.findAny();
        if (answero.isPresent()) {
            System.out.println(answer.get());
        }
    }
}
