package StreamAPI.Methods.MapToObj;


import java.util.stream.IntStream;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}
public class ConvertIntToCustomObject {
    public static void main(String[] args) {
        // Create an IntStream of IDs
        IntStream.range(1, 4)
                .mapToObj(id -> new Person(id, "Person" + id)) // Convert int to Person object
                .forEach(System.out::println); // Print each Person object
    }
}
