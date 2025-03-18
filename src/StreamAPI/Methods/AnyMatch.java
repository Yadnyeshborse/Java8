package StreamAPI.Methods;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(22,1,4,56,3,4,8,20);
        boolean answer=list.stream().anyMatch(i->(i*(i+1))/4==5);
        System.out.println(answer);

        Stream<String> stream=Stream.of("Geeks", "fOr",
                "GEEKSQUIZ", "GeeksforGeeks");

        boolean answe=stream.anyMatch(i->Character.isUpperCase(i.charAt(0)));
        System.out.println(answe);
    }
}
