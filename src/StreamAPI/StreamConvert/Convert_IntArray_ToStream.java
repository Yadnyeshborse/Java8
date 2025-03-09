package StreamAPI.StreamConvert;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Convert_IntArray_ToStream {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7};
        IntStream intStream= Arrays.stream(arr);
        intStream.forEach(System.out::println);
    }
}
