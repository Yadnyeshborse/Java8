package StreamAPI.LazyEvaluation;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Intermediate operations (lazy evaluation)
        numbers.stream()
                .filter(n -> {
                    System.out.println("Filtering: " + n);
                    return n % 2 == 0; // Keep even numbers
                })
                .map(n -> {
                    System.out.println("Mapping: " + n);
                    return n * n; // Square the number
                })
                .forEach(n -> System.out.println("Result: " + n)); // Terminal operation
    }
}

//Key Observations
//Lazy Evaluation:
//
//The filter and map operations are only executed when the terminal operation (forEach) is invoked.
//
//Each element is processed one at a time, and the pipeline is evaluated lazily.
//
//        Efficiency:
//
//Only the necessary computations are performed. For example, if the stream had 1000 elements but only 10 passed the filter, the map operation would only be applied to those 10 elements.
//
//Order of Execution:
//
//The operations are applied in the order they are defined in the pipeline.
//
//For each elemen
