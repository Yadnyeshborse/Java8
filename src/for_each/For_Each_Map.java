package for_each;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class For_Each_Map {
    public static void main(String[] args) {
        Map<Integer,Person> map=new HashMap<Integer,Person>();
        map.put(1,new Person("Mapbhau",156));
        map.put(2,new Person("QAS Kai",76));
        map.put(3,new Person("Bhau",765));

        //prior to java 8
        for (Map.Entry<Integer,Person> I:map.entrySet()){
            System.out.println(I.getKey());
            System.out.println(I.getValue().getName());

        }

        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });
    }
}
