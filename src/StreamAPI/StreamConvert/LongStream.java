package StreamAPI.StreamConvert;

import java.util.Arrays;

public class LongStream {
    public static void main(String[] args) {
        long[] arrL = { 3L, 5L, 6L, 8L, 9L };
        java.util.stream.LongStream longStream= Arrays.stream(arrL);
        longStream.forEach(System.out::println);
    }
}
