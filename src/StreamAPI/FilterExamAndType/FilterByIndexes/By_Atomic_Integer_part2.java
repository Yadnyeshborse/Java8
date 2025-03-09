package StreamAPI.FilterExamAndType.FilterByIndexes;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;


//This will skip first 2 string
public class By_Atomic_Integer_part2 {
    public static void main(String[] args) {
        // Input array
        String[] array = new String[]{"stream", "is", "a",
                "sequence", "of", "elements",
                "like", "list"};

        AtomicInteger index=new AtomicInteger(0);
        Stream<String> stream= Arrays.stream(array).skip(2);

        stream.filter((str)->{
            int currentIndex=index.getAndIncrement();
            return currentIndex%2==0;
        }).forEach(System.out::println);


    }
}
