package OptionalClass.Module;

import java.util.Optional;

public class GetMethod {
    public static void main(String[] args) {
        String name="Raj";
        Optional<String> optional=Optional.ofNullable(name);
        System.out.println(optional.get());

        //get method is used to get value only

    }
}
