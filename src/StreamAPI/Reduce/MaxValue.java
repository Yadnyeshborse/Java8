package StreamAPI.Reduce;

import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> list=List.of(7,23,67,1,32,9);

        int max=list.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println(max);

//        Identity: Integer.MIN_VALUE (the smallest possible integer value, used as the initial value for the maximum).
//        Accumulator: (a, b) -> a > b ? a : b (compares the current element b with the accumulated result a and returns the larger value).

//        Step-by-Step Processing
//        The reduce() method processes the stream elements one by one, updating the accumulated result (a) at each step. Here's how it works:
//
//        Initial State
//        Identity: a = Integer.MIN_VALUE (initial value).
//
//                The stream elements are: [10, 20, 5, 30, 15].
//
//        Step 1: Process 10
//        Current Element (b): 10.
//
//        Accumulated Result (a): Integer.MIN_VALUE.
//
//                Comparison: a > b → Integer.MIN_VALUE > 10 → false.
//
//                New Accumulated Result (a): 10 (since 10 is greater than Integer.MIN_VALUE).
//
//        Step 2: Process 20
//        Current Element (b): 20.
//
//        Accumulated Result (a): 10.
//
//        Comparison: a > b → 10 > 20 → false.
//
//                New Accumulated Result (a): 20 (since 20 is greater than 10).
//
//        Step 3: Process 5
//        Current Element (b): 5.
//
//        Accumulated Result (a): 20.
//
//        Comparison: a > b → 20 > 5 → true.
//
//                New Accumulated Result (a): 20 (since 20 is greater than 5).
//
//        Step 4: Process 30
//        Current Element (b): 30.
//
//        Accumulated Result (a): 20.
//
//        Comparison: a > b → 20 > 30 → false.
//
//                New Accumulated Result (a): 30 (since 30 is greater than 20).
//
//        Step 5: Process 15
//        Current Element (b): 15.
//
//        Accumulated Result (a): 30.
//
//        Comparison: a > b → 30 > 15 → true.
//
//                New Accumulated Result (a): 30 (since 30 is greater than 15).
      }
}
