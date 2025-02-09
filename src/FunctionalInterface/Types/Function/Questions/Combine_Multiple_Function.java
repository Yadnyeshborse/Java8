package FunctionalInterface.Types.Function.Questions;

import java.util.function.Function;

public class Combine_Multiple_Function {
    public static void main(String[] args) {
        Function<String,String> toUppercase=o->o.toUpperCase();
        Function<String,String> resverString=p->new StringBuilder(p).reverse().toString();
        Function<String,String> addExclamation=i->i+"!";
        Function<String,String> result=toUppercase
                .andThen(resverString)
                .andThen(addExclamation);
        System.out.println(result.apply("hello"));
    }
}
