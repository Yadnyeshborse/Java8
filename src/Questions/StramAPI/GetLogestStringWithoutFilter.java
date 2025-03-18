package Questions.StramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GetLogestStringWithoutFilter {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
        Optional<String> result=list.stream().reduce((str1, str2)->str1.length()>str2.length()?str1:str2);
        System.out.println(result);
    }
}
