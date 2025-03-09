package StreamAPI.StreamCreate;


import java.util.stream.Stream;

public class Using_Stream_Builder {
    public static void main(String[] args) {
        Stream.Builder<String> builder=Stream.builder();
        Stream<String> stringStream=builder
                .add("Raj")
                .add("OPP")
                .build();
        stringStream.forEach(System.out::println);
    }
}

//        Stream.builder()	Dynamic or conditional stream creation.
//        Stream.of()	Creating a stream from a fixed set of known elements.
//        Arrays.stream()	Creating a stream from an array (supports both object and primitive arrays).
//        Collection.stream()	Creating a stream from a collection (e.g., List, Set).
//        Stream.iterate()	Creating an infinite or finite stream using iteration logic.
//        Stream.generate()	Creating an infinite stream using a supplier.
