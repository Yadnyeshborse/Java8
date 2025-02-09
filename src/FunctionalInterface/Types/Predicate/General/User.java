package FunctionalInterface.Types.Predicate.General;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    public String name;
    public String role;


    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<User> data= Arrays.asList(new User("Raj","Teacher"),new User("Manish","Chief"));
        List<User> admin=data.stream().filter(u->u.role.equals("Chief")).collect(Collectors.toList());
        System.out.println(admin);
    }
}
