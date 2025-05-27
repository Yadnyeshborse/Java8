package Questions.Lambda;

import java.util.stream.IntStream;

public class Print_No_BasedOnEvenIndex_ByPart2 {
    public static void main(String[] args) {
        String[] list={"stream", "is", "a",
                "sequence", "of", "elements",
                "like", "list"};

        IntStream.range(0, list.length)
                .filter(i->i%2==0)
                .mapToObj(i->list[i])
                .forEach(System.out::println);
        //You're creating a stream of primitive int values — not objects. That stream is of type:
        //So the elements you're working with in the stream at that point are primitive integers, not String.
    }
}
