package Questions.interviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Group_Pair_anagrams_from_a_list_of_Strings_16 {
    public static void main(String[] args) {
        String[] s = {"pat", "tap", "pan", "nap"};
        List<String> list = Arrays.asList(s);

        // ✅ First way: using split + stream
        Collection<List<String>> listCollections = list.stream()
                .collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split(""))
                        .sorted()
                        .collect(Collectors.joining()) // join back into a string
                ))
                .values();

        System.out.println("First method result:");
        System.out.println(listCollections);

        // ✅ Second way: using helper method with char array
        Collection<List<String>> strings = Arrays.stream(s).collect(Collectors.groupingBy(word -> sortingstring(word.toLowerCase()))).values();
        System.out.println("Second way="+strings);

    }

    private static String sortingstring(String word) {
        char ch[]=word.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}