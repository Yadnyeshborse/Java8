package Questions.InterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversedEachElemnntInString {
    public static void main(String[] args) {
        String name="Chettach is fastest animal";
        String strRevrse= Arrays.stream(name.split(" "))
                .map(a->new StringBuffer(a).reverse()).collect(Collectors.joining(" "));
        System.out.println(strRevrse);

        //reverese string of array
        List<String> list = Arrays.asList("apple", "banana", "orange");

        List<String> reversed = list.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(reversed); // Output: [elppa, ananab, egnaro]

        IntStream.rangeClosed(0,10).filter(i->i%2==0).forEach(i->System.out.println(i));
    }
}
