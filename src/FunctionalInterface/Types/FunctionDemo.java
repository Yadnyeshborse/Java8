package FunctionalInterface.Types;

import java.util.function.Function;


//class FuncyionImp implements Function<String,Integer> {
//
//    @Override
//    public Integer apply(String s) {
//        return s.length();
//    }
//}
public class FunctionDemo {
    public static void main(String[] args) {
        //Traditional approach
//        Function<String, Integer> fun=new FuncyionImp();
//        System.out.println(fun.apply("Manav"));

        Function<String ,Integer> function=(String s)-> s.length();
        System.out.println(function.apply("TAUU"));



    }
}
