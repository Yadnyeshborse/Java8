package StreamAPI.StreamConvert;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Convert_Set_to_Stream {
    public static void main(String[] args) {

        // Creating an Integer HashSet
        Set<Integer> set = new HashSet<>();

        // adding elements in set
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(10);
        set.add(12);

        // converting Set to Stream
        Stream<Integer> stream = set.stream();

        // displaying elements of Stream using lambda expression
        stream.forEach(elem->System.out.print(elem+" "));

    }
}
