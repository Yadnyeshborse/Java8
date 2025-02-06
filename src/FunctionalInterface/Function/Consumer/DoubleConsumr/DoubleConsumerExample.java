import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {
    public static void main(String[] args) {
        // Consumer to print the value
        DoubleConsumer consumer = (input) -> System.out.println("Input value: " + input);

        // Consumer to print the square of the value
        DoubleConsumer printSquare = (data) -> System.out.println("Square: " + (data * data));

        // Combining both consumers using andThen
        DoubleConsumer combinedConsumer = consumer.andThen(printSquare);

        // Use the combined DoubleConsumer
        combinedConsumer.accept(5.5);
    }
}
