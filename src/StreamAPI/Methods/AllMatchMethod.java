package StreamAPI.Methods;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatchMethod {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,6,8,10);
        Boolean result=list.stream().allMatch(n->n%2==0);
        System.out.println(result);
//--------------------------------------------------------
        Stream<String> stream= Stream.of("Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");
        boolean answer=stream.allMatch(str->str.length()>2);
        System.out.println(answer);
        //------------------------------------------------------|

        // Creating a Stream of Strings
        Stream<String> streamo = Stream.of("Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");
        boolean answero = streamo.allMatch(str-> Character
                .isUpperCase(str.charAt(1)));
        System.out.println(answero);
    }
}
