package OptionalClass.Module;

import java.util.Optional;

public class HashCode {
    public static void main(String[] args) {
        Optional<Integer> op
                = Optional.of(456);

        System.out.println("Optional: "
                + op);

        System.out.println("Optional hashCode value: "
                + op.hashCode());
        //The hashCode() method of java.util.Optional class in Java is used to get the hashCode value of this Optional instance.
        // If there is no value present in this Optional instance, then this method returns 0.
    }
}
