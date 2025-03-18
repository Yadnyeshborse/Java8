package StreamAPI.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropwhileMethod {
    public static void main(String[] args) {
        List<Integer> no= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        no.stream().dropWhile(i->i<5).forEach(System.out::println);

        //--------------------------------

        Stream<Integer> stream
                = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

        // apply dropWhile to drop all the numbers
        // matches passed predicate
        List<Integer> list
                = stream.dropWhile(number -> (number / 4 == 1))
                .collect(Collectors.toList());

        // print list
        System.out.println(list);

        //

        // create a stream of names
        Stream<String> strea
                = Stream.of("aman", "amar", "suraj",
                "suvam", "Zahafuj");

        // apply dropWhile to drop all the names
        // matches passed predicate
        List<String> listo
                = strea.dropWhile(name -> (name.charAt(0) == 'a'))
                .collect(Collectors.toList());

        // print list
        System.out.println(listo);
    }
}
