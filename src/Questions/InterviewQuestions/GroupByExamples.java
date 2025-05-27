package Questions.InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByExamples {

    static class Employee {
        String name;
        String department;
        int age;
        double salary;

        public Employee(String name, String department, int age, double salary) {
            this.name = name;
            this.department = department;
            this.age = age;
            this.salary = salary;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public int getAge() { return age; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return name + " | " + department + " | Age: " + age + " | Salary: " + salary;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Sales", 30, 60000),
                new Employee("Bob", "Marketing", 29, 50000),
                new Employee("Raj", "IT", 25, 95580),
                new Employee("Tau", "Teaching", 36, 57565),
                new Employee("Sau", "IT", 23, 67687),
                new Employee("Mira", "Sales", 28, 61000),
                new Employee("John", "Marketing", 35, 54000),
                new Employee("Neha", "IT", 27, 72000),
                new Employee("Ravi", "Teaching", 40, 59800),
                new Employee("Tina", "HR", 32, 48000)
        );

        // 1. Group By Employee Department
        System.out.println("1. Group By Department:");
        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDept.forEach((dept, list) -> System.out.println(dept + " -> " + list));

        // 2. Count of Employees Per Department
        System.out.println("\n2. Count of Employees Per Department:");
        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        countByDept.forEach((dept, count) -> System.out.println(dept + " -> " + count));

        // 3. Average Salary Per Department
        System.out.println("\n3. Average Salary Per Department:");
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment() ,Collectors.averagingDouble(Employee::getSalary)));
        avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " -> " + avgSalary));

        //4.Empolyee names by departmeweise
        System.out.println("Employe name departwise");
        Map<String,List<String>> mal=employees.stream().
                collect(Collectors.groupingBy(i->i.getDepartment(),Collectors.mapping(o->o.getName(),Collectors.toList())));
        mal.forEach((department,name)->System.out.println(department+"->"+name));

        //eomplye departwise higjest salery
        System.out.println("________");
        System.out.println("Higest slary");
        Map<String,Optional<Employee>> map=employees.stream().collect(Collectors.groupingBy((i)->i.getDepartment(),Collectors.maxBy(Comparator.comparing(o->o.getSalary()))));
        map.forEach((department,salary)->System.out.println(department+"->"+salary));

    }
}
