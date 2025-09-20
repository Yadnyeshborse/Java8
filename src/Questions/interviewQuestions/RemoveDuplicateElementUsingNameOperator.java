package Questions.interviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " - $" + salary;
    }
}

public class RemoveDuplicateElementUsingNameOperator {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Alice", 70000),
                new Employee("Charlie", 70000)
        );

        List<Employee> uniqueByName = new ArrayList<>(
                list.stream()
                        .collect(Collectors.toMap(
                                Employee::getName,   // key: name
                                emp -> emp,          // value: employee object
                                (existing, replacement) -> existing  // merge function: keep first
                        ))
                        .values()
        );

        uniqueByName.forEach(System.out::println);

        List<String> lista = Arrays.asList("apple", "banana", "apple", "orange");
        Set<String> uniqueSet = new HashSet<>(lista );
        System.out.println(uniqueSet); // [banana, orange, apple] (order not guaranteed)


    }
}
