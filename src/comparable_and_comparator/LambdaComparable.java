package comparable_and_comparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class LambdaComparable  {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Alice", 19));
        students.add(new Student("Charlie", 21));

        // Sort by name, then by age using lambda expressions
        students.sort(Comparator.comparing((Student s) -> s.getName())
                .thenComparing((Student s) -> s.getAge()));

        // Print sorted students
        System.out.println("Students sorted by name, then by age:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
