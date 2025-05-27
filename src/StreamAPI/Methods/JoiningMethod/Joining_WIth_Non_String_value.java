package StreamAPI.Methods.JoiningMethod;

import java.util.List;
import java.util.stream.Collectors;

public class Joining_WIth_Non_String_value {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        String result = numbers.stream()
                .map(integer -> integer.toString()) // Convert integers to strings
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
