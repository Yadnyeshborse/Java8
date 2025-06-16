package Questions.InterviewQuestions;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Can_we_reuse_streams {
    public static void main(String[] args) {
        //Use a supplier if you need the same stream multiple times
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("a", "b", "c");

        streamSupplier.get().forEach(System.out::println);         // OK
        streamSupplier.get().map(String::toUpperCase).forEach(System.out::println); // OK

    }
}
