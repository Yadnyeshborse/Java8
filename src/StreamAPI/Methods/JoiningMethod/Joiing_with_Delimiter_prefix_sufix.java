package StreamAPI.Methods.JoiningMethod;

import java.util.List;
import java.util.stream.Collectors;

public class Joiing_with_Delimiter_prefix_sufix {
    public static void main(String[] args) {
        List<String> list=List.of("Java", "is", "awesome");
        String result = list.stream()
                .collect(Collectors.joining(" ", "[", "]"));

        System.out.println(result);
    }
}
