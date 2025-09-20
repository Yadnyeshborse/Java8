package Questions.interviewQuestions;

import java.util.stream.IntStream;

public class PrimeNo {
    public static void main(String[] args) {
        int limit = 50;

        System.out.println("Prime numbers up to " + limit + ":");

        IntStream.rangeClosed(2, limit)
                .filter(num -> isPrime(num))
                .forEach(n -> System.out.print(n + " "));
    }

    public static boolean isPrime(int num) {
        return IntStream.rangeClosed(2, (int)Math.sqrt(num))
                .allMatch(n -> num % n != 0);
    }
}

