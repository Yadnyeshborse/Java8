package OptionalClass.Module;

import java.util.Optional;

public class EmptyOptionalMethod {
    public static void main(String[] args) {
        String value=null;
        Optional<String> optional=Optional.empty();
        System.out.println(optional);
        //Optional.empty() is a static method that returns an empty Optional instance, meaning it contains no value.
        //An Optional is a container object which may or may not contain a non-null value. When you call Optional.empty(), you're explicitly creating an Optional that is empty, i.e., there is no value inside it.

    }
}
