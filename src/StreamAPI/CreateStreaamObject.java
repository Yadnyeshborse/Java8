package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreaamObject {
    public static void main(String[] args) {
        //create stream
        Stream<String> stream=Stream.of("A","B","C","D");
       // stream.forEach(s -> System.out.println(s));

        //create stream from source
        Collection<String> collection= Arrays.asList("ASD","KLP","POO");
        Stream<String> op=collection.stream();
        //op.forEach(Sp->System.out.println(Sp));

        List<String> so=Arrays.asList("cat","ball","moures");
        Stream<String> l=so.stream();
        //l.forEach(p->System.out.println(p));

        Set<String> seto=new HashSet<>(so);
        Stream<String> ass=seto.stream();
        ass.forEach(System.out::println);

        String arr[]={"1","2","3","4","5"};
        Stream<String> a= Arrays.stream(arr);
        a.forEach(System.out::println);

        System.out.println("_________________________________________________");
    }
}
