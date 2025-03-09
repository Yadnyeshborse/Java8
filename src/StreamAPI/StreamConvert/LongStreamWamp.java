package StreamAPI.StreamConvert;
import java.util.stream.LongStream;
public class LongStreamWamp {
    public static void main(String[] args) {
        // Create a LongStream from individual values
        LongStream stream = LongStream.of(10L, 20L, 30L, 40L, 50L);
        stream.forEach(System.out::println);
    }
}
