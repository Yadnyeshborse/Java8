package PartionBy;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionEvenOddCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 4, 9, 12, 15, 6, 3, 8, 11);

        // Partition into even and odd lists
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        // Count even and odd numbers
        Map<Boolean, Long> partitionedCounts = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.counting()));

        System.out.println("Even numbers: " + partitionedNumbers.get(true));
        System.out.println("Count of Even numbers: " + partitionedCounts.get(true));

        System.out.println("Odd numbers: " + partitionedNumbers.get(false));
        System.out.println("Count of Odd numbers: " + partitionedCounts.get(false));
    }
}
