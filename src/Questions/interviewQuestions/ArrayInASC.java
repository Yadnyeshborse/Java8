package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayInASC {
    public static void main(String[] args) {
        int[] arr={12,3,2,5,7,94};
        Arrays.stream(arr).mapToObj(o->o).sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
