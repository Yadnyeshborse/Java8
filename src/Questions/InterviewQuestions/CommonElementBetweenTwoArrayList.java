package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class CommonElementBetweenTwoArrayList {
    public static void main(String[] args) {

        //find common element in list
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list1=Arrays.asList(4,5,6,7,8,9);
        list.stream().filter(o1 -> list1.contains(o1)).forEach(o->System.out.println(o));

        //find element that start with number
        List<String> list2=Arrays.asList("Isnumber","Opp","2dd","5ll");
        list2.stream().filter(o->Character.isDigit(o.charAt(0))).forEach(System.out::println);

    }
}
