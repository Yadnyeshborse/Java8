package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Find_words_withspecific_no_of_vowel {
    public static void main(String[] args) {
        String name="I am learning stream ai";
        Arrays.stream(name.split(" "))
                .filter(i->i.replaceAll("[^aeiouAEIOU]"," ").length()==2).
                forEach(i->System.out.println(i));

        //occurrence of each character
        String s="Misioiojsaa";
        Map<String,Long> longMap=Arrays.stream(s.split("")).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(longMap);


    }
}
