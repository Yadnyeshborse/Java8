package StreamAPI.Methods;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ForeachMethod {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,1,4,3,8,7,4);
        list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);

        Stream<String> strea= Stream.of("GFG", "Geeks",
                "for", "GeeksforGeeks");
        strea.sorted(Comparator.reverseOrder())
                .flatMap(i->Stream.of(i.charAt(1)))
                .forEach(System.out::println);
    }
}
