package StreamAPI.StreamConvert;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class DoubleStreamExample {
    public static void main(String[] args) {
        // Input array
        double[] arrD = { 1, 2, 3, 4, 5 };

        // Create a DoubleStream from the array
        DoubleStream stmD = Arrays.stream(arrD);

        // Print each element of the stream
        stmD.forEach(d -> System.out.print(d + " "));
    }
}