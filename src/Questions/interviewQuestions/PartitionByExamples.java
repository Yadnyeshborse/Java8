package Questions.interviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionByExamples {
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

        // Partition employees by whether they earn more than 60,000
        Map<Boolean, List<Employee>> highEarners = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary()>60000));

        // Print the result
        System.out.println("Employees with salary > 60000:");
        highEarners.get(true).forEach(System.out::println);

        System.out.println("\nEmployees with salary <= 60000:");
        highEarners.get(false).forEach(System.out::println);

        //partion empolyee by age and count that
        Map<Boolean,Long>  empolueCount=employees.stream()
                .collect(Collectors.partitioningBy(emp->emp.getAge()>30,Collectors.counting()));
        System.out.println("Employees older than 30: " + empolueCount.get(true));
        System.out.println("Employees 30 or younger: " + empolueCount.get(false));



    }
}
