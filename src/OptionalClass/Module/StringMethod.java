package OptionalClass.Module;

import java.util.Optional;

public class StringMethod {
    public static void main(String[] args) {
        // create a Optional
        Optional<Integer> op
                = Optional.of(452146);

        // get value using toString
        String value = op.toString();

        // print value
        System.out.println("String Representation: "
                + value);
    }
}
