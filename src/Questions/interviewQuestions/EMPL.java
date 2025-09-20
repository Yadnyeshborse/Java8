package Questions.interviewQuestions;

public class EMPL {
    String name;
    Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public EMPL() {
    }

    @Override
    public String toString() {
        return "EMPL{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public EMPL(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
}
