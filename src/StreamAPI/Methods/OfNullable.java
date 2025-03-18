package StreamAPI.Methods;

import java.util.ArrayList;
import java.util.stream.Stream;

public class OfNullable {
    public static void main(String[] args) {
        Stream<String> value
                = Stream.ofNullable(null);

        // Print values
        System.out.println("Values of Stream:");
        value.forEach(System.out::println);

        // Create ArrayList containing names
        ArrayList<String> list = new ArrayList<String>();
        list.add("Aman");
        list.add("Suraj");
        list.add("Zufaq");

        // create a stream with ArrayList
        Stream<ArrayList<String>> valuep
                = Stream.ofNullable(list);

        // print values
        System.out.println("Values of Stream:");
        valuep.forEach(System.out::println);
    }
}
