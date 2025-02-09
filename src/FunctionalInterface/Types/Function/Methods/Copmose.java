package FunctionalInterface.Types.Function.Methods;

import java.util.function.Function;

public class Copmose {
    public static void main(String[] args) {
        Function<Integer,Double> res=i->i/2.0; //than this will get execute
        res=res.compose(o->o+10);  //first this will get execute
        System.out.println(res.apply(10));
    }
}
