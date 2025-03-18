package OptionalClass.Module;

import java.util.Optional;

public class OrElseGetMethod {
    public static void main(String[] args) {
        //The orElseGet() method of java.util.Optional class in Java is used to get the value of this
        // Optional instance if present. If there is no value present in this Optional instance,
        //then this method returns the value generated from the specified supplier.
        // create a Optional
        Optional<Integer> op
                = Optional.empty();

        // print supplier
        System.out.println("Optional: "
                + op);

        try {

            // orElseGet supplier
            System.out.println("Value by orElseGet"
                    + "(Supplier) method: "
                    + op.orElseGet(
                    () -> (int)(Math.random() * 10)));
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
