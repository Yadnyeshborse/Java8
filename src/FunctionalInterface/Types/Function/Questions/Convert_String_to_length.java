package FunctionalInterface.Types.Function.Questions;

import java.util.function.Function;

public class Convert_String_to_length {
    public static void main(String[] args) {
        //to find lenght of string
        //comsumer is nor good approach a sit does not resturn anything it just print so functioni is beeter approach to solve it

        Function<String,Integer> stringLength=o->o.length();
        int result=stringLength.apply("Helllo");
        System.out.println(result);
    }
}
