import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalaryExample {
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

        @Override
        public String toString() {
            return name + " : " + salary;
        }
    }

    public static OptionalDouble findNthHighestSalary(List<Employee> employees, int n) {
        if (n <= 0 || employees == null || employees.isEmpty()) {
            return OptionalDouble.empty();
        }

        return employees.stream()
                .mapToDouble(employee -> employee.getSalary())
                .distinct()
                .sorted()
                .skip(employees.stream().mapToDouble(Employee::getSalary).distinct().count() - n)
                .findFirst();
    }

    public static String getOrdinalSuffix(int n) {
        if (n >= 11 && n <= 13) {
            return n + "th";
        }
        switch (n % 10) {
            case 1: return n + "st";
            case 2: return n + "nd";
            case 3: return n + "rd";
            default: return n + "th";
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 60000),
                new Employee("Bob", 50000),
                new Employee("Raj", 95580),
                new Employee("Tau", 57565),
                new Employee("Sau", 67687),
                new Employee("Mira", 61000),
                new Employee("Neha", 72000),
                new Employee("John", 54000),
                new Employee("Ravi", 59800),
                new Employee("Tina", 48000)
        );

        int n = 3;
        String ordinal = getOrdinalSuffix(n);

        OptionalDouble nthHighest = findNthHighestSalary(employees, n);

        if (nthHighest.isPresent()) {
            System.out.println(ordinal + " highest salary is: " + nthHighest.getAsDouble());

            // Bonus: Print all employees with this salary
            double salary = nthHighest.getAsDouble();
            List<Employee> employeesWithSalary = employees.stream()
                    .filter(e -> e.getSalary() == salary)
                    .collect(Collectors.toList());

            System.out.println("Employees with this salary: " + employeesWithSalary);
        } else {
            System.out.println("Could not find " + ordinal + " highest salary.");
        }
    }
}