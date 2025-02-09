package FunctionalInterface.Types.Function.Questions;

import java.util.function.Function;

public class Square_and_then_add {
    public static void main(String[] args) {
        Function<Integer,Integer> square=o->o*o;
        Function<Integer,Integer> add=p->p+10;
        Function<Integer,Integer> res=square.andThen(add);
        System.out.println(res.apply(10));
    }
}
