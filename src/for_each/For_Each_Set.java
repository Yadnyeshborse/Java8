package for_each;

import java.util.HashSet;
import java.util.Set;

public class For_Each_Set {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<>();
        set.add(new Person("Manus",56));
        set.add(new Person("Cat",44));
        set.add(new Person("OP",123));

        //by prior to java 8
        for (Person s:set){
            System.out.println(s.getName());
            System.out.println(s.getAge());
        }

        //by lambda
        set.forEach((Person->{
            System.out.println(Person.getAge());
            System.out.println(Person.getName());
        }));

        //by stream
        System.out.println("By stream");
        set.stream().forEach((Person->{
            System.out.println(Person.getAge());
            System.out.println(Person.getName());
        }));
    }
}
