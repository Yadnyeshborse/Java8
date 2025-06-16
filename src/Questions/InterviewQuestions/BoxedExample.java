package Questions.InterviewQuestions;

import java.util.List;
import java.util.stream.IntStream;

public class BoxedExample {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 6)  // primitive stream: 1 to 5
                .boxed()                               // convert int -> Integer
                .toList();                             // collect to List<Integer>

        System.out.println(list);

       // boxed() is a method in the Java Stream API that converts a primitive stream (like IntStream, LongStream, DoubleStream) into a Stream of wrapper objects (Stream<Integer>, Stream<Long>, Stream<Double>).
    }
}
