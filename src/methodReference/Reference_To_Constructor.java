package methodReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Reference_To_Constructor {
    public static void main(String[] args) {
        //Reference To contructor
        List<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pinaapple");


        //by traditional ways
        Function<List<String>, Set<String>> setFunction=(fruitsList)->new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        //by lambda expression
        Function<List<String>, Set<String>> setFunctionLambda= HashSet::new;
        System.out.println(setFunctionLambda.apply(fruits));

    }
}
