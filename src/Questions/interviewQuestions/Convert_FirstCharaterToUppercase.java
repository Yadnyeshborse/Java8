package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_FirstCharaterToUppercase {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("ss","kcjdc","ioio");
        List<String> list1=list.
                stream().
                map(x->x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()).
                collect(Collectors.toList());
        System.out.println(list1);
    }
}
