package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface Group_list_of_strings_by {
    public static void main(String[] args) {
        //Group list of strings by their first character and count the number of strings
        List<String> list= Arrays.asList("Mapi","Maopa","Aidosido","Ass","KL");
        Map<Character, Long> map=list.stream().collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
        System.out.println(map);
    }
}
