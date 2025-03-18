package StreamAPI.Methods.BuilderMethods;

import java.util.stream.DoubleStream;

public class Builder_to_build {
    public static void main(String[] args) {
        // Creating a Stream in building phase
        DoubleStream.Builder b = DoubleStream.builder();

        // Adding elements into the stream
        b.add(1.2);
        b.add(2.4);
        b.add(3.87);
        b.add(4.78);

        // Constructing the built stream using build()
        // This will enter the stream in built phase
        b.build().forEach(System.out::println);
    }
}
