package Questions.InterviewQuestions;

import java.util.Map;
import java.util.Optional;

public class Return_max_element_In_Map {
    public static void main(String[] args) {
        Map<Character,Long> freq=Map.of(
                'a', 2L,
                'b', 5L,
                'c', 1L
        );
        Optional<Map.Entry<Character,Long>> map=freq.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(map);
    }
}
