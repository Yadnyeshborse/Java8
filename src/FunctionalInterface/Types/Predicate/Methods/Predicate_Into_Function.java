package FunctionalInterface.Types.Predicate.Methods;

import java.util.function.Predicate;

public class Predicate_Into_Function {
    static void pred(int number, Predicate<Integer> predicate){
        System.out.println(predicate.test(number));
    }
    public static void main(String[] args) {
        pred(100,(i)->i>10);
        pred(67,(i)->i%2==0);
        pred(63,(i)->i<8);

    }
}
