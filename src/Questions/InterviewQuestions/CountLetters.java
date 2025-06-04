package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountLetters {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Rahul","Myo","Tauu","Saurabh","Rahul");
        List<String> names = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "apple");


        //find element and their size
        Map<String,Integer> map=list.stream().distinct().collect(Collectors.toMap(str->str, String::length));
        System.out.println("Element "+map);

        //find duplicate element and their count
        //Function.identity() same as name->name
        Map<String, Long> duplicates = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  //// Step 1: build frequency map
                .entrySet()  //// Step 2: get Set<Map.Entry<String, Long>>
                .stream()//// <--- Step 3: convert the entry set into a Stream<Entry<String, Long>>
                .filter(e -> e.getValue() > 1)//// <--- filter out non-duplicates   // Step 4: filter only entries where the count > 1 (duplicates)
                .collect(Collectors.toMap(stringLongEntry -> stringLongEntry.getKey(), stringLongEntry1 -> stringLongEntry1.getValue()));

        System.out.println("Duplicate elements with their counts:");
        duplicates.forEach((k, v) -> System.out.println(k + " -> " + v));

//        Map<String, Long> map1=names
//                .stream()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().filter(i->i.getValue()>1)
//                .collect(Collectors.toMap((key)->key.getKey(),(value)->value.getValue()));
//        System.out.println("Duplicate element and their count");
//        map1.forEach((key,value)->System.out.println(key+"->"+value));





    }
}
