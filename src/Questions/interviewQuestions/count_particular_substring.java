package Questions.interviewQuestions;

import java.util.stream.IntStream;

public class count_particular_substring {
    public static void main(String[] args) {
        String s="byebyebyechennai";
        String check="bye";

        long intstraem =IntStream.range(0,s.length()-2).filter(x->s.substring(x,x+3).equals(check)).count();
        System.out.println(intstraem);
    }
}
