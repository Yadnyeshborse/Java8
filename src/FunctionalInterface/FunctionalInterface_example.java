package FunctionalInterface;

@FunctionalInterface
public interface FunctionalInterface_example {
    void msg(String msggg);

    default void mai(){
        System.out.println("Default Method");
    }

    static void std(){
        System.out.println("Static method called");
    }

}
