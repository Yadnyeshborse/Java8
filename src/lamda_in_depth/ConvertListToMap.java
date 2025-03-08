package lamda_in_depth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMap {
    private Integer key;
    private String value;

    public ConvertListToMap(Integer key,String value) {
        this.value = value;
        this.key = key;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        List<ConvertListToMap> list=new ArrayList<>();
        list.add(new ConvertListToMap(1,"I"));
        list.add(new ConvertListToMap(2,"Love"));
        list.add(new ConvertListToMap(3,"You"));

        Map<Integer,String> map=new HashMap<>();
        list.forEach(item->map.put(item.getKey(), item.value));
        System.out.println(map);


    }
}
