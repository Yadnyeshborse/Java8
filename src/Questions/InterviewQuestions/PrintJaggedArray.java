package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrintJaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = Stream.of(
                        new int[]{1, 2},
                        new int[]{3, 4, 5},
                        new int[]{6, 7, 8, 9})
                .toArray(int[][]::new);
        Arrays.stream(jaggedArray)
                .forEach(row -> {
                    // loop through each element of the current row using streams
                    Arrays.stream(row)
                            .forEach(element -> System.out.print(element + " "));
                    // move to the next line for the next row
                    System.out.println();
                });
    }
}
