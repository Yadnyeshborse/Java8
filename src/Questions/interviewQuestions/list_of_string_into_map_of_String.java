package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class list_of_string_into_map_of_String {
    public static void main(String[] args) {

        List<String> fruits= Arrays.asList("orange","banana","kiwi","banana");

        Map<String,Integer> map=fruits.stream().collect(Collectors.toMap(fru->fru,String::length,(existing,duplicate)->existing));
        System.out.println(map);
    }
}
