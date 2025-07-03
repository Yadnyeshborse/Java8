package Questions.Lambda;

import java.util.stream.IntStream;

public class Print_No_BaseeOnEvenIndex_Skiptwono {
    public static void main(String[] args) {
        String[] list={"stream", "is", "a",
                "sequence", "of", "elements",
                "like", "list"};

        IntStream.range(0,list.length)
                .filter((u)->u%2==0)
                .mapToObj(p->list[p]).skip(2).forEach(System.out::println);

//        IntStream.rangeClosed(2, list.length-1).filter((str)->str%2==0)
//                .mapToObj(x->list[x])
//                .forEach(System.out::println);



    }
}
