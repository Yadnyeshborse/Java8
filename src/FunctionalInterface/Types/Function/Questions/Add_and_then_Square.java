package FunctionalInterface.Types.Function.Questions;

import java.util.function.Function;

public class Add_and_then_Square {
    public static void main(String[] args) {
        Function<Integer,Integer> square=o->o*o;
        Function<Integer,Integer> add=i->i+10;
        Function<Integer,Integer> res=square.compose(add);
        System.out.println(res.apply(5));
    }
}
