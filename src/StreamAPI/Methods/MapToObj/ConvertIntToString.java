package StreamAPI.Methods.MapToObj;

import java.util.stream.IntStream;

public class ConvertIntToString {
    public static void main(String[] args) {
        IntStream.range(1,6).
                mapToObj(i->"Number In string format ="+i).
                forEach(i->System.out.println(i));
    }
}
