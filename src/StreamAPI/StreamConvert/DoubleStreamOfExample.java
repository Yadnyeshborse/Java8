package StreamAPI.StreamConvert;
import java.util.stream.DoubleStream;

public class DoubleStreamOfExample {
    public static void main(String[] args) {
        // Create a DoubleStream from individual values
        DoubleStream stream = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5);
        stream.forEach(System.out::println);
    }
}
