package StreamAPI.StreamCreate;

import java.util.stream.IntStream;

public class CreateStream {
    public static void main(String[] args) {
        var stream= IntStream.rangeClosed(1,100);
        var max=stream.filter(num->num%4==0).count();
        System.out.println(max);
    }
}
