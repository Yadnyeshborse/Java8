package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Cactus");
        fruits.add("Banana");
        fruits.add("Apple");

        List<String> result=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        //System.out.println(result);

        //shorttcut
        List<String> res=fruits.stream().sorted((obj1,obj2)->obj1.compareTo(obj2)).collect(Collectors.toList());
        System.out.println(res);

        //by default it will sort
        List<String> result2=fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(result2);


        //by descending order
        List<String> ansByDesc=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("By DESC order"+ ansByDesc);

        //by lambda Expresstion to sort by desc
        List<String> result4Bydesc=fruits.stream().sorted((obj1,obj2)->obj2.compareTo(obj1)).collect(Collectors.toList());
        System.out.println("DESC By lambda "+result4Bydesc);

    }
}
