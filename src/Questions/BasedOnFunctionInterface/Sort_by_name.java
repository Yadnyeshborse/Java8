package Questions.BasedOnFunctionInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_by_name {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Zebra","Donkey","Apple");

        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
        list.forEach((o)->System.out.println(o));
    }
}
