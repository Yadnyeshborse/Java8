package StreamAPI.Methods.JoiningMethod;

import java.util.List;
import java.util.stream.Collectors;

public class Joining_with_empty_string {
    public static void main(String[] args) {
        List<String> words = List.of();

        String result = words.stream()
                .collect(Collectors.joining(", ", "Prefix: ", " :Suffix"));

        System.out.println(result);
    }}
