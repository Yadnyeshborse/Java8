package StreamAPI.Methods.BuilderMethods;

import java.util.stream.Stream;

public class BuilderExampke1 {
    public static void main(String[] args) {
        Stream.Builder<String> bu=Stream.builder();
        Stream<String> result=bu.add("Hello").build();
        result.forEach(System.out::println);
    }
}
