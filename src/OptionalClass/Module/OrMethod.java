package OptionalClass.Module;

import java.util.Optional;

public class OrMethod {
    public static void main(String[] args) {
        //The or() method of java.util.Optional class in Java is used to
        // get this Optional instance if any value is present.
        // If there is no value present in this Optional instance, then this method returns an Optional instance with the value generated from the specified supplier.
        // create a Optional
        Optional<Integer> op
                = Optional.empty();

        // print supplier
        System.out.println("Optional: "
                + op);

        try {

            // or supplier
            System.out.println("Optional by or(() ->"
                    + " Optional.of(100)) method: "
                    + op.or(() -> Optional.of(100)));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
