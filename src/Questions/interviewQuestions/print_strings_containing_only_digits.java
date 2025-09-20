package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class print_strings_containing_only_digits {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("123","12","abs","xyz");
        List<String> list1=list.stream().filter(x->x.matches("[0-9]+")).collect(Collectors.toList());
        System.out.println(list1);
    }
}
