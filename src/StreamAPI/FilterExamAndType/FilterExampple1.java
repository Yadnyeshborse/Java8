package StreamAPI.FilterExamAndType;

import java.util.stream.Stream;

public class FilterExampple1 {
    public static void main(String[] args) {
        Stream<String> strea=Stream.of("ASS","OPP","LIP","http://hshsh");
        strea.filter(z->z.startsWith("http")).forEach(System.out::println);
    }
}
