package StreamAPI.Methods;

import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1)
                .limit(10) // Limit the stream to 10 elements
                .forEach(System.out::println);
        System.out.println("_____________________");
        Stream.iterate(1,n->n<20,n->n*2).forEach(System.out::println);
        System.out.println("_________________________");
        // Generate the first 10 Fibonacci numbers

        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(10)
                .map(fib -> fib[0])
                .forEach(System.out::println);
    }
}
