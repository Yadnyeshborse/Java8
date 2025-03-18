package OptionalClass.Module;

import java.util.Optional;

public class FilterMethod {
    public static void main(String[] args) {
        //The filter() method of java.util.Optional class in Java is used to filter the value of this
        //Optional instance by matching it with the given Predicate, and then return the filtered Optional
        // instance. If there is no value present in this Optional instance, then this method returns an empty Optional instance.
        // create a Optional
        Optional<Integer> op
                = Optional.of(9456);

        // print value
        System.out.println("Optional: "
                + op);

        // filter the value
        System.out.println("Filtered value "
                + "for odd or even: "
                + op
                .filter(num
                        -> num % 2 == 0));


    }
}
