package StreamAPI.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMethod {
    public static void main(String[] args) {
        // filter() method with the operation of filtering out the elements divisible by 5.
        List<Integer> arrays=Arrays.asList(5,10,15,2,3,1,6);
        arrays.stream().filter(i->i%5==0).forEach(System.out::println);

        //filter() method with the operation of picking the elements with an upperCase letter at index
        Stream<String> stream = Stream.of(
                "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
        stream.filter(i->Character.isUpperCase(i.charAt(1))).forEach(System.out::println);
        //filter() method with the operation picking the elements ending with custom alphabetically letter say it be ‘s’ for implementation purposes.
        System.out.println("________________");
        Stream<String> strea = Stream.of(
                "Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");
        strea.filter(i->i.endsWith("s")).forEach((System.out::println));

    }
}
