package StreamAPI.Methods.BuilderMethods;

import java.util.stream.Stream;

public class BuilderEample2 {
    public static void main(String[] args) {
        Stream.Builder<String> res=Stream.builder();
        Stream<String> result=res
                .add("A")
                .add("B")
                .add("C")
                .add("D")
                .add("E")
                .build();
        result.forEach(System.out::println);
    }
}
