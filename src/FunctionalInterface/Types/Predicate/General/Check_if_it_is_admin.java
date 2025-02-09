package FunctionalInterface.Types.Predicate.General;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Check_if_it_is_admin {
    public String role;
    public int age;

    @Override
    public String toString() {
        return "Check_if_it_is_admin{" +
                "role='" + role + '\'' +
                ", age=" + age +
                '}';
    }

    public Check_if_it_is_admin(String role, int age) {
        this.role = role;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Check_if_it_is_admin> data= Arrays.asList(new Check_if_it_is_admin("Admin",21),new Check_if_it_is_admin("User",65));
        List<Check_if_it_is_admin> result=data.stream().filter((o)->o.role.equals("Admin")).collect(Collectors.toList());
        System.out.println(result);
    }
}
