package Questions.InterviewQuestions;



import java.util.*;
import java.util.stream.Collectors;

public class EmpolueSalaryAndrelated {
    static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
        public String toString() {
            return name + " - $" + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 70000)
        );

        // Get salary summary (count, sum, min, average, max)
        DoubleSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingDouble(employee -> employee.getSalary()));

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        //separate and divide employee by certain condition
        Map<Boolean,List<Employee>> listMap=list.stream().collect(Collectors.partitioningBy((emp)->emp.getSalary()>50000));
        System.out.println("\nEmployees with salary > 50000:");
        listMap.get(true).forEach(System.out::println);

        //get name
        List<String> list1=listMap.get(true).stream().map(name->name.name).collect(Collectors.toList());
        System.out.println(list1);


    }
}
