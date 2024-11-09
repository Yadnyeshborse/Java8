package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> deal= Arrays.asList("a","b","c","d");

        //by traditional ways
        List<String> dealq=new ArrayList<>();
        for (String s:deal){
            dealq.add(s.toUpperCase());
        }

        System.out.println(deal);
        System.out.println(dealq);

        //by map
        List<String> m=deal.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(m);
    }
}
