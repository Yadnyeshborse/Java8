package StreamAPI.Methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedMethid {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5, -10, 7, -18, 23);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("___________________________________");

        // sorting the elements of array based
        // on their last character
        String[] array = { "GFG", "Geeks", "for",
                "GeeksforGeeks", "GeeksQuiz" };
        Stream.of(array).sorted((str1, str2)
                        -> Character.compare(str1
                                .charAt(str1.length() - 1),
                        str2.charAt(str2.length() - 1)))
                .         forEach(System.out::println);
    }
}
