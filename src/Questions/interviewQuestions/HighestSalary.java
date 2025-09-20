package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestSalary {
    public static void main(String[] args) {
        List<Double> salary= Arrays.asList(50000.0, 75000.0, 60000.0, 90000.0, 85000.0, 90000.0);
        int max=2;
        Optional<Double> data=HighestSalaryByMax(salary,max);
        data.ifPresentOrElse(sala->System.out.println("Max salary is "+sala),
                ()->System.out.println("Salary not fount"));


    }

    public static Optional<Double> HighestSalaryByMax(List<Double> salary, int max) {
        if (salary==null||max<=0){
            return Optional.empty();
        }
        Optional<Double> aDouble;
        return  salary
                .stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(max-1)
                .findFirst();
    }
}
