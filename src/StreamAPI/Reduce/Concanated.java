package StreamAPI.Reduce;

import java.util.List;

public class Concanated {
        public static void main(String[] args) {
            List<String> words = List.of("Hello", " ", "World", "!");

            // Using reduce() to concatenate strings
            String concatenated = words.stream()
                    .reduce("", (a, b) -> a + b);

            System.out.println("Concatenated: " + concatenated); // Output: Concatenated: Hello World!
        }
}
