package Questions.InterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class find_the_first_non_repeated_character {
    public static void main(String[] args) {
        String name="Hello Worlde";
        int firstIndez=name.indexOf('H');
        int lastindex=name.lastIndexOf('H');
       // System.out.println(firstIndez+" "+lastindex);

        //first way
//        Arrays.stream(name.split("")).filter(i->name.indexOf(i)==name.lastIndexOf(i)).findFirst().ifPresentOrElse(
//                ch -> System.out.println("First non-repeated character: " + ch),
//                () -> System.out.println("No non-repeated character found.")
//        );;
//        //System.out.println(ate);

        //2 way
//        Map<Character,Long> result=name.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
//        char ts=result.entrySet().stream().filter(i->i.getValue()==1).map(p->p.getKey()).findFirst().get();
//
//        System.out.println(ts);


        //3 red way
        char result=name.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()==1).map(p->p.getKey()).findFirst().get();
        System.out.println(result);
    }
}
