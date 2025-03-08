package StreamAPI.FilterExamAndType.FilterByIndexes;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Int_Stream_Example {
    public static void main(String[] args) {
        String[] array = new String[]{"stream", "is", "a",
                "sequence", "of", "elements",
                "like", "list"};


        IntStream.rangeClosed(0,array.length-1).
                filter(x->x%2==0)
                .mapToObj(x->array[x])
                .forEach(System.out::println);
    }
}
