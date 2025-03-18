package OptionalClass.Module;

import java.util.Optional;

public class OfMethod {
    public static void main(String[] args) {
        String value=null;
        Optional<String> op=Optional.of(value);
        //System.out.println(op);
        //when we used of it throw nullpointer error

        //if we give some value it will not throw error

    }
}
