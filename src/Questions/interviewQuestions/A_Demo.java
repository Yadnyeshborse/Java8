package Questions.interviewQuestions;

import java.util.*;

import static java.util.Arrays.stream;

public class A_Demo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,5);
        OptionalDouble aDoubl=list.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println(aDoubl);
    }
}
