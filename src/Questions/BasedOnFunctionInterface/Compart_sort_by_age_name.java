package Questions.BasedOnFunctionInterface;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student{
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}


public class Compart_sort_by_age_name {
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>(Arrays.asList(
                new Student("Ramu",90),
                new Student("Zkasy",87),
                new Student("Ramu",65),
                new Student("Mani",34),
                new Student("Ramu",34)
        ));



        students.forEach((x)->System.out.println(x));

        System.out.println("**************After sorting *************");
        students.sort(Comparator.comparing((Student student)->student.getName())
                .thenComparing((Student student)->student.getAge()));

        students.forEach((o)->System.out.println(o));
    }
}
