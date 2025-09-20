package A_Demo;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ASA {
    public static void main(String[] args) {
        IntStream.range(2,50).filter(num->isPrime(num)).forEach(System.out::println);
}

    private static boolean isPrime(int num) {
        return  IntStream.rangeClosed(2,(int)Math.sqrt(num)).allMatch(nu->num%nu!=0);

    }
}
