package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EMPLIMP {
    public static void main(String[] args) {
        List<EMPL> list = Arrays.asList(new EMPL("Sunil",5666.0),
                new EMPL("Raj",9000.0),
                new EMPL("Saurab",454.0));

        list.stream().filter(i->i.getSalary()>5000.0).
                peek(o->o.setSalary(o.getSalary()+1000.0)).
                collect(Collectors.toList()).
                forEach(System.out::println);
    }
}
