package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class CustomSorting {
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
        List<CustomSorting.Employee> employees = Arrays.asList(
                new CustomSorting.Employee("Alice", "Sales", 30, 60000),
                new CustomSorting.Employee("Bob", "Marketing", 29, 50000),
                new CustomSorting.Employee("Raj", "IT", 25, 95580),
                new CustomSorting.Employee("Tau", "Teaching", 36, 57565),
                new CustomSorting.Employee("Sau", "IT", 23, 67687),
                new CustomSorting.Employee("Mira", "Sales", 28, 61000),
                new CustomSorting.Employee("John", "Marketing", 35, 54000),
                new CustomSorting.Employee("Neha", "IT", 27, 72000),
                new CustomSorting.Employee("Ravi", "Teaching", 40, 59800),
                new CustomSorting.Employee("Tina", "HR", 32, 48000)
        );

       //custom sorting
        List<Employee> employ = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())
                        .thenComparing(Employee::getName))
                .toList();

        System.out.println(employ);


    }
}
