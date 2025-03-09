package StreamAPI.FilterExamAndType.FilterByIndexes;

import java.util.stream.IntStream;

//excluding first 2 element
public class Int_stream_Part2 {
    public static void main(String[] args) {
        String[] array = new String[]{"stream", "is", "a",
                "sequence", "of", "elements",
                "like", "list"};

        IntStream.rangeClosed(2, array.length-1).filter((str)->str%2==0)
                .mapToObj(x->array[x])
                .forEach(System.out::println);

    }
}
