package Questions.Lambda;



import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(3,"Raj");
        map.put(2,"Sam");
        map.put(1,"Aar");

        Map<Integer,String> sortedArray;
        map.entrySet().stream().forEach((ma)->System.out.println(ma.getKey()+" "+ma.getValue()));
        //System.out.println(sortedArray);
    }
}

