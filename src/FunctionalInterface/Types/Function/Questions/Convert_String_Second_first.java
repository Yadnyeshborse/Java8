package FunctionalInterface.Types.Function.Questions;

import java.util.function.Function;

public class Convert_String_Second_first {
    public static void main(String[] args) {
        // Function to convert a string to uppercase
        Function<String, String> toUpperCase = s -> s.toUpperCase();

        // Function to add an exclamation mark
        Function<String, String> addExclamation = s -> s + "!";

        // Chain the functions using compose
        Function<String, String> addExclamationThenToUpper = toUpperCase.compose(addExclamation);

        // Apply the chained function
        String result = addExclamationThenToUpper.apply("hello");
        System.out.println(result); // Output: HELLO!

        //first it will be like hello!
        //second it will be HELLO!
    }
}
