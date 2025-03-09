package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamImp {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);

        list.forEach(i->System.out.println(i));

        // Stream operations
        // 1. Getting the stream from this collection
        // 2. Filtering out only even elements
        // 3. Collecting the required elements to List

        List<Integer> list1=list.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());

        System.out.println(list1);


    }
}
