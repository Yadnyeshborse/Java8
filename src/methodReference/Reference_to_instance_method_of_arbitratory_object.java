package methodReference;

import java.util.Arrays;
import java.util.function.Function;

public class Reference_to_instance_method_of_arbitratory_object {

    public static void main(String[] args) {
        //Reference to instance method of arbitory object of specific type

        //sometimes we call a instance method of arbitory object
        //in that case we can method reference to call an instance

        //traditional ways
        Function<String,String> stringfunction=(String input)->input.toLowerCase();
        System.out.println(stringfunction.apply("LLLLLLLL"));

        //using lambda expression
        Function<String,String> stringStringFunctionByLmada=(String lmandainput)->lmandainput.toLowerCase();
        System.out.println(stringStringFunctionByLmada.apply("QQQQQQQQ"));

        //another example
        //by traditional ways
        String[] strArray={"A","E","I","O","U","A","Q","M","P"};
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(strArray));

        //by lambda expression
        Arrays.sort(strArray,String::compareToIgnoreCase);

    }
}
