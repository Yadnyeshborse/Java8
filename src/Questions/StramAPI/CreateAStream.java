package Questions.StramAPI;


import java.util.stream.Stream;

public class CreateAStream {
    public static void main(String[] args) {
        Stream<String> stream=Stream.<String>builder()
                .add("Hello")
                .add("World")
                .add("Java")
                .build();
        stream.forEach(System.out::println);
    }
}
