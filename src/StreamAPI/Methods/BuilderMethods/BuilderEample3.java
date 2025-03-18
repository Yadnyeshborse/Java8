package StreamAPI.Methods.BuilderMethods;

import java.util.stream.Stream;

public class BuilderEample3 {
    public static void main(String[] args) {
        Stream.Builder<String> buil=Stream.builder();
        Stream<String> stream=buil
                .add("Raj")
                .add("Vasant")
                .add("Patil")
                .build();
        stream.forEach(System.out::println);
    }
}
