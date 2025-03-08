package StreamAPI.LazyEvaluation;

import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        // Infinite stream of random numbers
        Stream.generate(() -> Math.random())
                .limit(5) // Limit the stream to 5 elements
                .forEach(n -> System.out.println("Random Number: " + n));
    }
}


//Explanation
//Infinite Stream:
//
//        Stream.generate(() -> Math.random()) creates an infinite stream of random numbers.
//
//Lazy Evaluation:
//
//The limit(5) operation ensures that only 5 elements are generated and processed.
//
//Without lazy evaluation, this would result in an infinite loop.
//
//Terminal Operation:
//
//The forEach operation triggers the evaluation of the stream.