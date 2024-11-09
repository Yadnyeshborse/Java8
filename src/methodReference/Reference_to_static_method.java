package methodReference;


import java.util.function.BiFunction;
import java.util.function.Function;

public class Reference_to_static_method {
    public static int addition(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {

        //Method Reference to static method

        //1.Method Reference to static method
        //Using Lambda Expression
        Function<Integer,Double> function=(input)-> Math.sqrt(input);
        System.out.println(function.apply(4));

        //using method reference
        Function<Integer,Double> functionMethodReference= Math::sqrt;
        System.out.println(functionMethodReference.apply(4));

        //another example
        BiFunction<Integer,Integer,Integer> biFunction=(a,b)-> Reference_to_static_method.addition(a,b);
        System.out.println(biFunction.apply(2,7));

        //by using static method refernence
        BiFunction<Integer,Integer,Integer> biFunctionMethodRefernce= Reference_to_static_method::addition;
        System.out.println(biFunctionMethodRefernce.apply(2,71));

    }
}
