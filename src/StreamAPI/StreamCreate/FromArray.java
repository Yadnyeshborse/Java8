package StreamAPI.StreamCreate;



import StreamAPI.Differ_bet_Collection_Stream.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;


public class FromArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8,9};
       IntStream streamp= Arrays.stream(arr);
        streamp.forEach(System.out::println);
    }
}
