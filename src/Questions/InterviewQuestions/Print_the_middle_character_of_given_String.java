package Questions.InterviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Print_the_middle_character_of_given_String {
    public static void main(String[] args) {
        String name="Educatiion";
        int len=name.length();
        int mid=len/2;
        String midsChar = IntStream.range(0, len)
                .filter(x -> len % 2 == 0 ? (x == mid || x == mid - 1) : x == mid)
                .mapToObj(name::charAt)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

        System.out.println("Middle character(s): " + midsChar);
    }
}
