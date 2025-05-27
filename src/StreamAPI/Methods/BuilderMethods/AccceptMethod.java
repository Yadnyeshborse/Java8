package StreamAPI.Methods.BuilderMethods;


import java.util.stream.Stream;

public class AccceptMethod {
    public static void main(String[] args) {
        Stream.Builder<String> stro=Stream.builder();
        stro.accept("GO");
        stro.accept("For");
        stro.accept("IT");
        Stream<String> s= stro.build();
        s.forEach(System.out::println);

        //__________________________________
        // Create a Stream.Builder
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        Stream.Builder<String> builder = Stream.builder();

        // Add multiple elements to the builder
        builder.add("Hello")
                .add("World")
                .add("Java")
                .add("Stream");

        // Build the stream
        Stream<String> stream = builder.build();

        // Process the stream
        stream.forEach(System.out::println);
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        //__________________________________________________

        Stream.Builder<String> str_b = Stream.builder();

        // using Stream.Builder accept(T t)
        str_b.accept("5");
        str_b.accept("6");
        str_b.accept("7");
        str_b.accept("8");
        str_b.accept("9");

        // Creating the String Stream
        // The stream has now entered the built phase
        Stream<String> so = str_b.build();

        // printing the elements
        System.out.println("Stream successfully built");
        so.forEach(System.out::println);

        // Trying to add another element into the stream
        // Since the Stream is in built phase
        // This operation is not possible now
        // Hence accept() will throw exception now

        try {
            str_b.accept("50");
        }
        catch (Exception e) {
            System.out.println("Exception thrown "
                    + "when now adding element into the stream: "
                    + e);
        }
    }
}
