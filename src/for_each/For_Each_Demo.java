package for_each;

import java.util.ArrayList;
import java.util.List;

public class For_Each_Demo {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<Person>();
        list.add(new Person("Raj",67));
        list.add(new Person("Tau",90));
        list.add(new Person("Ravi",67));

        //prior to java 8
        for (Person p:list){
//            System.out.println(p.getName());
//            System.out.println(p.getAge());
        }

        //by java 8
        list.forEach((Person-> {
            System.out.println(Person.getName());
            System.out.println(Person.getAge());
        }));

        //by stream
        list.stream().forEach((Person->{
            System.out.println(Person.getName());
            System.out.println(Person.getAge());
        }));

    }
}
class Person{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
