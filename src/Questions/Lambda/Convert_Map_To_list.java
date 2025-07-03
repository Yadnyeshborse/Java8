package Questions.Lambda;

import java.util.*;

public class Convert_Map_To_list {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(7,"Zebra");
        map.put(8,"Port");
        map.put(1,"Aaru");

        System.out.println(map);

        //converting
        List<Map.Entry<Integer,String>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);


        //
        List<Integer> keys = new ArrayList<>(map.keySet());
        System.out.println(keys); // [7, 8, 1]

        List<String> values=new ArrayList<>(map.values());
        System.out.println(values);

    }
}
