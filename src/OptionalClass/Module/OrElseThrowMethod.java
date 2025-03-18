package OptionalClass.Module;

import java.util.Optional;

public class OrElseThrowMethod {
    public static void main(String[] args) {
       // The orElseThrow() method of java.util.Optional class in Java is used to get the
        //value of this Optional instance if present. If there is no value present in this
        // Optional instance, then this method throws the exception generated from the specified supplier.
        // create a Optional
        Optional<Integer> op
                = Optional.empty();

        // print supplier
        System.out.println("Optional: "
                + op);

        try {

            // orElseThrow supplier
            System.out.println(
                    "Value by orElseThrow("
                            + "ArithmeticException::new) method: "
                            + op.orElseThrow(
                            ArithmeticException::new));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
