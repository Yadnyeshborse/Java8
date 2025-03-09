package map_and_flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Raj");
        list.add("Patil");
        list.add("op");
        List<Integer> collect = list.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
