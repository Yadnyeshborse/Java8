package StreamAPI.Methods.MapToObj;

import java.util.stream.IntStream;

public class ConvertIntToCharater {
    public static void main(String[] args) {
        IntStream.range(65,70).mapToObj(o->"Charater "+(char)o).forEach(System.out::println);
    }
}
