package StreamAPI.Methods.MapToObj;

import java.util.stream.DoubleStream;

public class ConvertDoubleToString {
    public static void main(String[] args) {
        // Create a DoubleStream of values
        DoubleStream.of(1.1, 2.2, 3.3)
                .mapToObj(d -> "Value: " + d) // Convert double to String
                .forEach(System.out::println); // Print each string
    }
}
