package FunctionalInterface.Types.Function.Questions;

import java.util.function.Function;

public class ModifySring {
    public static void main(String[] args) {
        Function<String,String> toUppercase=o->o.toUpperCase();
        Function<String,String> toAddExclamationMark=p->p+" ! ";
        Function<String,String> completeData=toUppercase.andThen(toAddExclamationMark);
        System.out.println(completeData.apply("hello"));
    }
}
