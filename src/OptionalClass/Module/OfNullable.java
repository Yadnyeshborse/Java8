package OptionalClass.Module;

import java.util.Optional;

public class OfNullable {
    public static void main(String[] args) {
        String value=null;
        Optional<String> op=Optional.ofNullable(value);
        System.out.println(op);

        //of Nullable handle null value more perfectly
    }
}
