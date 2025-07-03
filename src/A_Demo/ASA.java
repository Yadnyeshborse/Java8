package A_Demo;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ASA {
    public static void main(String[] args) {



        String name="Hello Worlde LSHUDIO dsudsiudisiwud";
        String resul=Arrays.stream(name.split(" ")).sorted(Comparator.comparing((String i)->i.length()).reversed()).skip(1).findFirst().get();
        System.out.println(resul);
    }
}
