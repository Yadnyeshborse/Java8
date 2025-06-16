package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_String_Of_Letters {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("POPP","ASV","BAS","POI");
        List<String> list1=list.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);
    }
}
