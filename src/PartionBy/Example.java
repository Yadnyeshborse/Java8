package PartionBy;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 4, 9, 12, 15, 6, 3, 8, 11);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println("Even numbers:");
        partitioned.get(true).forEach(System.out::println);

        System.out.println("\nOdd numbers:");
        partitioned.get(false).forEach(System.out::println);
    }
}

