package Questions.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Print_No_BasedOnEvenIndex {
    public static void main(String[] args) {
        String[] list={"stream", "is", "a",
                "sequence", "of", "elements",
                "like", "list"};
        AtomicInteger index=new AtomicInteger(0);
        Arrays.stream(list).filter((str)->{
            int val=index.getAndIncrement();
            return val%2==0;
        }).forEach(i->System.out.println(i));
    }
}
